class Solution {
    public int minOperations(int k) {
        if(k==1) return 0;

        int min_operation = Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            int j = (int) Math.ceil((k*1.0)/(i+1)) -1;
            min_operation = Math.min(min_operation,i+j);
        }
    return min_operation;
    }
}