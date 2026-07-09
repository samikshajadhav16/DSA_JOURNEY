class Solution {
    public int countSubarray(int nums[],int k)
    {
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length)
        {
            if(nums[r]%2==1) sum+=1;
            while(sum>k)
            {
                if(nums[l]%2==1) sum-=1;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
    return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
    return countSubarray(nums,k)-countSubarray(nums,k-1);
    }
}