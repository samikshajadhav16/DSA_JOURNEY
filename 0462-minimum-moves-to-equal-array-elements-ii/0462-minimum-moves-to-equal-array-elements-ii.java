// TC - O(N)
class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int median = 0;
        median = nums[nums.length/2];
        //if(nums.length%2!=0) median = nums[nums.length/2];
        //else median = nums[nums.length/2] + nums[(nums.length+1)/2];
        for(int i=0;i<nums.length;i++)
        {
            moves += Math.abs(nums[i]-median);
        }
    return moves;
    }
}