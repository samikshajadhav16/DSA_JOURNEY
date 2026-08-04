class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls =new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])  min=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])  max=nums[i];
        }

        
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int i=min;i<=max;i++)
        {
            if(!(set.contains(i)))
            {
                ls.add(i);
            }
        }
    return ls;
    }
}