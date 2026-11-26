class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean result=true;
        while(n>=remove)
        {
            n-=remove;
            remove--;
            result = !result;
        }
    return !result;
    }
}