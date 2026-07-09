class Solution {
    public int countSubarray(int nums[],int goal)
    {
        int count=0,sum=0;
        int l=0,r=0;
        if(goal<0) return 0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
    return count;
    }

public int numSubarraysWithSum(int[] nums, int goal) {
    return countSubarray(nums,goal)-countSubarray(nums,goal-1);
    }
}