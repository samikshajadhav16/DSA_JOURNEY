class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long sum=0;
        String num = Integer.toString(n);
        String x="";
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)!='0')
            {
                x+=num.charAt(i);
                int nums = num.charAt(i)-'0';
                sum+=nums;
            }
        }
        long ans = Long.parseLong(x);
    return ans*sum;
    }
}