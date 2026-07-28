class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        if(num.length()==k) return "0";

        for(int i=0;i<num.length();i++)
        {
            while(!s.isEmpty() && k>0 && (s.peek()-'0')>(num.charAt(i)-'0'))
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }

        while(k>0) 
        {
            s.pop();
            k--;
        }

        if(s.isEmpty()) return "0";
        
        StringBuilder result=new StringBuilder();
        while(!s.isEmpty())
        {
            result.append(s.pop());
        }

        while(result.length()!=0 && result.charAt(result.length()-1)=='0')
        {
            result.deleteCharAt(result.length()-1);
        }

        if(result.length()==0) return "0";
        result.reverse();
    return result.toString();
    }
}