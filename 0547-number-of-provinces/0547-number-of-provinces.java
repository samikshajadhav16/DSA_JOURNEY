class Solution {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[])
    {
        visited[node]=true;
        for(Integer i:adj.get(node))
        {
            if(visited[i]==false)
            {
                dfs(i,adj,visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=isConnected.length;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected.length;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean visited[] = new boolean[isConnected.length];
        int count=0;
        
        for(int i=0;i<isConnected.length;i++)
        {
            if(visited[i]==false)
            {
                count++;
                dfs(i,adj,visited);
            }
        }
    return count;
    }
}