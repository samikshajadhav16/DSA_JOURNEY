class Solution {
    public boolean canJump(int[] nums) {
        int jump=0,maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxi) return false;
            jump = i+nums[i];
            maxi = Math.max(maxi,jump);
        }   
        if(maxi>=nums.length) return true;
    return true;
    }
}