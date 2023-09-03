class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int minSum =Integer.MAX_VALUE;
        Integer [][] memo = new Integer[n][n];
        for(int j=0; j<n;j++){
            int temp = solve(matrix,0,j,memo);
            minSum = Math.min(minSum,temp );
        }
        return minSum;
    }

    public int solve(int[][] matrix, int i, int j, Integer[][] dp){
        if(j<0 || j==matrix.length) return Integer.MAX_VALUE;

        if(i== matrix.length-1) return matrix[i][j];
        if(dp[i][j] !=null) return dp[i][j];

        int left = solve(matrix, i+1,j-1,dp);
        int below = solve(matrix, i+1,j,dp);
        int right = solve(matrix, i+1,j+1,dp);

        dp[i][j] = Math.min(left, Math.min(below, right)) + matrix[i][j];
        return dp[i][j];
    }
}