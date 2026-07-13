class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            int maxfreq=Integer.MIN_VALUE,minfreq=Integer.MAX_VALUE;
            for(int values:map.values())
            {
                maxfreq = Math.max(maxfreq,values);
                minfreq = Math.min(minfreq,values);
            }
            int diff = maxfreq-minfreq;
            sum+=diff;
            }
        }
    return sum;
    }
}