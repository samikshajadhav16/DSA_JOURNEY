class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int len =0;
       int left=0,right=0;
       Map<Integer,Integer> map = new HashMap<>();

       while(right<nums.length)
       {
          if(map.containsKey(nums[right]))
          {
            map.put(nums[right],map.get(nums[right])+1);
                while(map.get(nums[right])>k)
                {
                map.put(nums[left],map.get(nums[left])-1);
                left++;
                }
            }
          else {
            map.put(nums[right],1);
          }

          len = Math.max(len,right-left+1);
          right++;
       }
    return len;
    }
}