class Solution {
    public String frequencyString(String s)
    {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder str = new StringBuilder("");
        char c = 'a';
        for(int i:freq)
        {
            str.append(c);
            str.append(i);
            c++;
        }
        return str.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs)
        {
            String frequencyStr = frequencyString(s);
            if(map.containsKey(frequencyStr))
            {
                map.get(frequencyStr).add(s);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(frequencyStr,ls);
            }
        }
    return new ArrayList<>(map.values());
    }
}