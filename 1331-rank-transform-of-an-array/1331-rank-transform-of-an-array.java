class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[] = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        int rank=1;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:copy)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank);
                rank++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
    return arr;
    }
}