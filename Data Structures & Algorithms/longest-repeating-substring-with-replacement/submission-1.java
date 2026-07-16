class Solution {
    public int characterReplacement(String str, int k) {
      int[] arr = new int[26];
        String s=str.toLowerCase();
        s.toLowerCase();
        System.out.println(str);
        Arrays.fill(arr, 0);
        int left = 0;
        int right = 1;
        int ans = 0;
        int max=-1;
                    arr[s.charAt(0) - 'a']++;
        while (right < s.length()) {
            int length = right - left + 1;
            arr[s.charAt(right) - 'a']++;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            if(length-max<=k){
            ans = Math.max(ans, right - left + 1);
            right++;
            }else{
                            arr[s.charAt(left) - 'a']--;
                            left++;
                            right++;
            }
        }
        return ans;
    }
}
