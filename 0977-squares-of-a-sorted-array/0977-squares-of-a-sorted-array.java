class Solution {
    public int[] sortedSquares(int[] nums) {
        //int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int ans = num*num;
            nums[i]=ans;
            ans=0;
        }
        Arrays.sort(nums);
return nums;
    }
}