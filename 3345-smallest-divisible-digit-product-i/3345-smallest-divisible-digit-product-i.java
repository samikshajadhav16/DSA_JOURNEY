class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++)
        {
            String str = Integer.toString(i);
            if(str.length()==1)
            {
                char c = str.charAt(0);
                int num = Character.getNumericValue(c);
                if(num%t==0) return num;
            }
            else if(str.length()==2)
            {
                char c1 = str.charAt(0);
                char c2 = str.charAt(1);
                int n1 = Character.getNumericValue(c1);
                int n2 = Character.getNumericValue(c2);
                int prod = n1*n2;
                if(prod%t==0){
                    int answer = Integer.parseInt(str);
                    return answer;
                }
            }
            else if(str.length()==3)
            {
                char c1 = str.charAt(0);
                char c2 = str.charAt(1);
                char c3 = str.charAt(2);
                int n1 = Character.getNumericValue(c1);
                int n2 = Character.getNumericValue(c2);
                int n3 = Character.getNumericValue(c3);
                int prod = n1*n2*n3;
                if(prod%t==0){
                    int answer = Integer.parseInt(str);
                    return answer;
                }
            }
        }
    }
}