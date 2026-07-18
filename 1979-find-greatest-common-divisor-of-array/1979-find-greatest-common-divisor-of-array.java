class Solution {
    public int gcd(int mini,int maxi)
    {
        if(mini==0||maxi==0) return Math.max(mini,maxi);
        int ans = mini;
        while(ans>0)
        {
            if(mini%ans==0 && maxi%ans==0) break;
            ans--;
        }
    return ans;
    }
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            mini=Math.min(mini,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }
    return gcd(mini,maxi);
    }
}