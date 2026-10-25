class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int island = 0;
        for(int i=1; i<m-1; i++){
            for(int j=1; j<n-1; j++){
                if(grid[i][j] == 0 && !visited[i][j]){
                    if(dfs(grid, i, j, visited)){
                        island++;
                    }
                }
            }
        }
        return island;
    }

    public boolean dfs(int[][] grid, int i, int j, boolean[][] visited ){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n) return false;
        if(visited[i][j] || grid[i][j]==1) return true;
        visited[i][j] = true;
        boolean down = dfs(grid, i + 1, j, visited);
        boolean up = dfs(grid, i - 1, j, visited);
        boolean right = dfs(grid, i, j + 1, visited);
        boolean left = dfs(grid, i, j - 1, visited);

        return down && up && right && left;
    }
}