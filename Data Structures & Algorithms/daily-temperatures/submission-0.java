class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
             Stack<Integer> s1 = new Stack<>();
        int[] res = new int[temperatures.length];
        int k = 0;
        s1.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            while (s1.size()>0 && temperatures[s1.peek()] < temperatures[i]) {
                k = i - s1.peek();
                res[s1.peek()] = k;
                s1.pop();
                }
            s1.push(i);
        }
        return res;
    }
}