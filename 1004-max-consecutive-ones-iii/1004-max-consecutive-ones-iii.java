class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=0,maxlen=0,zeros=0;
        int left=0,right=0;
        while(right<nums.length)
        {
            if(nums[right]==0) zeros++;
            if(zeros>k)
            {
                if(nums[left]==0) zeros--;
                left++;
            }
            if(zeros<=k)
            {
                len = right-left+1;
                maxlen = Math.max(len,maxlen);
            }
            right++;
        }
    return maxlen;
    }
}