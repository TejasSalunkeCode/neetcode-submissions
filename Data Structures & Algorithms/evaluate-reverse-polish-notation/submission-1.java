class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s1 = new Stack<>();
        int ans = 0;
        // System.out.println(tokens.length);
        // System.out.println(Arrays.toString(tokens));
    if(tokens.length==1){
        return Integer.parseInt(tokens[0]);
    }
    if(tokens.length==0){
        return 0;
    }

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("*") && !tokens[i].equals("-")
                && !tokens[i].equals("/")) {
                s1.push(tokens[i]);
                // System.out.println(s1+"jjjj");

            } else {
                int a = Integer.parseInt(s1.pop());
                int b = Integer.parseInt(s1.pop());
                if (tokens[i].equals("+")) {
                    ans = b + a;
                } else if (tokens[i].equals("-")) {
                    ans = b - a;
                } else if (tokens[i].equals("*")) {
                    ans = b * a;
                } else if (tokens[i].equals("/")) {
                    ans = b / a;
                }
                String str = String.valueOf(ans);
                s1.push(str);
            }
            // System.out.println(ans);
            // System.out.println(s1);
        }
        return ans;
    }
}
