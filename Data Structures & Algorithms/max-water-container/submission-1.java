class Solution {
    public int maxArea(int[] heights) {
     int max=0;
      int left=0;
      int area=0;
      int dist=0;
      int right=heights.length-1;

      while (left!=right) {
        max=Math.min(heights[left], heights[right]);
        dist=right-left;
        area=Math.max( max*dist,area);
        if(heights[left]>=heights[right]){
            right--;
        }else{
            left++;
        }
      } 
      return area;

    }
}
