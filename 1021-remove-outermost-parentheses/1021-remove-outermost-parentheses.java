class Solution {
    public String removeOuterParentheses(String s) {
        String str ="";
        int counter=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(') 
            {
                if(counter>0) str+=c;
                counter++;
            }
            else if(c==')')
            {
                counter--;
                if(counter>0) str+=c;
            }
        }
    return str;
    }
}