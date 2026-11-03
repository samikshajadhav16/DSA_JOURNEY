class Solution {
    public int minMoves(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int moves=0;
        for(int i=0;i<nums.length;i++)
        {
            maxi = Math.max(maxi,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int diff = maxi - nums[i];
            moves += diff;
        }
    return moves;
    }
}