class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       if(nums.length==0) return 0;
       for(int i=0;i<nums.length;i++)
       {
        set.add(nums[i]);
       }
       
       int longest=1;
       for(int i:set)
       {
        if(!set.contains(i-1))
        {
            int x=i;
            int count=1;
            while(set.contains(x+1))
            {
                count++;
                x=x+1;
            }
            longest=Math.max(longest,count);
        }
       }
    return longest;
    }
}