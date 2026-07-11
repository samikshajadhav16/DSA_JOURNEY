class Solution {
    public int maxArea(int[] height) {
       int left=0,right=height.length-1;
       int maxWater=0,width=0,minHeight=0,current_maxWater=0;

       while(left<right)
       {
        minHeight = Math.min(height[left],height[right]);
        width = right-left;
        current_maxWater = minHeight*width;
        maxWater = Math.max(maxWater,current_maxWater);
        if(minHeight==height[left]) left++;
        else right--;
       }
    return maxWater;
    }
}