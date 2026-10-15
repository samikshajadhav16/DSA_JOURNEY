class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                set.add(nums.get(j));
                int count=set.size();
                sum+=(count*count);
            }
            set.clear();
        }
    return sum;
    }
}