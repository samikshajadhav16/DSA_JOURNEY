class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int left[] = new int[nums.length];
        int sum=1;
        left[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            sum*=nums[i-1];
            left[i]=sum;
        }
        sum=1;
        ans[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            sum*=nums[i+1];
            ans[i]=sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=ans[i]*left[i];
        }
    return ans;
    }
}