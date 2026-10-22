class Solution {
    //TC:O(N)
    //SC:O(1)
    public int maxArea(int[] heights) {
        
        int left=0;
        int right=heights.length-1;
        int area=0;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            int length=right-left;
            int breadth=Math.min(heights[left],heights[right]);
            area=length*breadth;
            maxArea=Math.max(maxArea,area);
            if(heights[left]<heights[right])left++;
            else right--;
        }
        return maxArea;
    }
}
