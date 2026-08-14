class Solution {
    public int maximumLengthSubstring(String s) {
       int len =0;
       int left=0,right=0;
       Map<Character,Integer> map = new HashMap<>();

       while(right<s.length())
       {
          if(map.containsKey(s.charAt(right)))
          {
            map.put(s.charAt(right),map.get(s.charAt(right))+1);

                while(map.get(s.charAt(right))>2)
                {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
                }
            }
          else {
            map.put(s.charAt(right),1);
          }
          len = Math.max(len,right-left+1);
          right++;
       }
    return len;
    }
}