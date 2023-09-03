class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        Integer [][] dp= new Integer[Grid.length][Grid[0].length];
        return solve(Grid,0,0,dp);
    }
    public int solve(int [][] grid, int i, int j, Integer[][] dp){

        if(i== grid.length|| j==grid[0].length || grid[i][j]==1) return 0;
        if(i==grid.length-1 && j==grid[0].length-1) return 1;
        if(dp[i][j] !=null) return dp[i][j];

        int right = solve(grid, i, j+1,dp);
        int down = solve(grid, i+1,j,dp);

        dp[i][j]= right + down;
        return dp[i][j];
    }
}