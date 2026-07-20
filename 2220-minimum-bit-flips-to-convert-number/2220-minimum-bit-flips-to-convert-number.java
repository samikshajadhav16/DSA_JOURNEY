class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start^goal;
        String b = Integer.toBinaryString(ans);
        int count=0;
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)=='1') count++;
        }
    return count;
    }
}