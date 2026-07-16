class Solution {
    public int trap(int[] height) {
            int left=0;
        int right=height.length-1;
        int total=0;
        int letmax=height[0];
        int rightmax=height[right];

        while (left<right) {
            if(height[left]<height[right]){
                letmax=Math.max(letmax, height[left]);
                if(letmax-height[left]>0){
                    total=total+letmax-height[left];
                }
                left++;
            }else{
                rightmax=Math.max(rightmax, height[right]);
                if(rightmax-height[right]>0){
                    total=total+rightmax-height[right];
                }
                right--;
            }
        }
        return total;
    }
}
