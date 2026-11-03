class Solution {
    public static void findSubsets(int nums[],int i,List<List<Integer>> ans,List<Integer> ls)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        
        //YES
        ls.add(nums[i]);
        findSubsets(nums,i+1,ans,ls);
        //NO
        ls.remove(ls.size()-1);
        findSubsets(nums,i+1,ans,ls);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        findSubsets(nums,0,ans,ls);
    return ans;
    }
}