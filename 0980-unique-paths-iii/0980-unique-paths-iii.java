class Solution {

    // Brute Force DFS + BackTracking
    public int uniquePathsIII(int[][] grid) {
        int row=0;
        int col =0;
        int zero=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0;j<grid[0].length;j++ ){
                if(grid[i][j] ==0) zero++;
                if(grid[i][j] ==1){
                    row =i;
                    col=j;
                }
            }
        }
        return solve(row,col,grid,zero);
    }

    public int solve( int i, int j,int[][] grid,int zero){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]== -1) return 0;
        if(grid[i][j]==2) {
            if(zero== -1) return 1;
            else return 0;
        };
        grid[i][j] =-1;
        zero--;

        int right = solve(i,j+1,grid,zero);
        int left = solve(i,j-1,grid,zero);
        int down = solve(i+1,j,grid,zero);
        int up = solve(i-1,j,grid,zero);

        int total = right + left + down + up;
        grid[i][j] =0;
        zero++;
        return total;
    }
}