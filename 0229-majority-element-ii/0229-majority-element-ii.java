class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int count1=0,count2=0,element1=Integer.MIN_VALUE,element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && nums[i]!=element2)
            {
                count1=1;
                element1 = nums[i];
            }
            else if(count2==0 && nums[i]!=element1)
            {
                count2=1;
                element2=nums[i];
            }
            else if(nums[i]==element1) count1++;
            else if(nums[i]==element2) count2++;
            else {
                count1--;
                count2--;
            }
        }

        double n = Math.floor(nums.length/3);
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(element1==nums[i])  count1++;
            else if(element2==nums[i])  count2++;
        }
        if(count1>n)    ls.add(element1);
        if(count2>n && element1!=element2)    ls.add(element2);
        
    return ls;
    }
}