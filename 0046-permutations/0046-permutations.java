class Solution {
    public static void find(int nums[],int i,List<List<Integer>> ans)
    {
        // base case
        if(nums.length==i)
        {
            List<Integer> ls = new ArrayList<>();
            for(int n:nums)
            {
                ls.add(n);
            }
            ans.add(ls);
            return;
        }
        //yes
        for(int j=i;j<nums.length;j++)
        {
            swap(nums,i,j);
            find(nums,i+1,ans);
            swap(nums,i,j); //backtrack
        }
    } 

    public static void swap(int nums[],int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        //List<Integer> ls = new ArrayList<>();
        find(nums,0,ans);
    return ans;
    }
}