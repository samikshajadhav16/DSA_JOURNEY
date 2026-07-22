class Solution {
    public String largestOddNumber(String num) {
       int last = num.length()-1,indx=-1;
       while(last>=0)
       {
        char c = num.charAt(last);
        int n = c - '0';
        if(c%2==1)
        {
            indx = last;
            break;
        }else{
            last--;
        }
       }
       if(indx==-1) return"";
       int i=0;
       while(i<=indx && num.charAt(i)=='0') i++;
    return num.substring(i,indx+1);
    }
}