class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0){
            return 0;
        }
        HashSet<Integer> numset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numset.add(nums[i]);
        }
        int longestSub=1;
        for(int num:numset){
            if(numset.contains(num-1)){
                continue;
            }else{
                int currNum=num;
                int currSub=1;
                while (numset.contains(currNum+1)) {
                    currNum++;
                    currSub++;
                }
                longestSub=Math.max(currSub, longestSub);
            }

        }
        return longestSub;
    }
}