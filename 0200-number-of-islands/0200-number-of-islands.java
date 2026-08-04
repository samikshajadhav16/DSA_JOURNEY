class Solution {
    public static void dfs(int i,int j,boolean visit[][],char[][] grid,int n,int m)
    {
        if(i<0||j<0||i>=n||j>=m||visit[i][j]==true||grid[i][j]!='1')
        {
            return;
        }
        visit[i][j]=true;
        dfs(i+1,j,visit,grid,n,m);
        dfs(i-1,j,visit,grid,n,m);
        dfs(i,j+1,visit,grid,n,m);
        dfs(i,j-1,visit,grid,n,m);
    }
    public int numIslands(char[][] grid) {
    int islands=0;
    int n = grid.length;
    int m = grid[0].length;
    boolean visit[][] = new boolean[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]=='1' && visit[i][j]==false)
            {
                islands++;
                dfs(i,j,visit,grid,n,m);
            }
        }
    }
    return islands;
    }
}