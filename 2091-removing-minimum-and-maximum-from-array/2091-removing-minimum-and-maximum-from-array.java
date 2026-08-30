class Solution {
    public int minimumDeletions(int[] nums) {
        int moves=0,mini=0,maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[maxi]) maxi=i;
            if(nums[i]<nums[mini]) mini=i;
        }
        int left = Math.min(mini,maxi);
        int right = Math.max(mini,maxi);
        int fornt = right+1;
        int back = nums.length-left;
        int frontback = (left+1)+(nums.length-right);
    return Math.min(fornt,Math.min(back,frontback));
    }
}