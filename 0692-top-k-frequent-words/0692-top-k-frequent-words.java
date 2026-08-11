class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();
        Map<String,Integer> map = new HashMap<>();
        if(words==null || words.length==0) return result;

        for(int i=0;i<words.length;i++)
        {
            if(map.containsKey(words[i]))
            {
                map.put(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }

        PriorityQueue<String> pq = new PriorityQueue<String>( new Comparator<String>() {
            public int compare(String s1 , String s2)
            {
                if(map.get(s1)==map.get(s2))
                {
                    return s1.compareTo(s2);
                }
                return map.get(s2)-map.get(s1);
            }
         });

        pq.addAll(map.keySet());
        
        for(int i=0;i<k;i++)
        {
            if(!pq.isEmpty())    result.add(pq.poll());
        }
    return result;
    }
}