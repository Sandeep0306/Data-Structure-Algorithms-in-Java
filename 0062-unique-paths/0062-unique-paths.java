class Solution {

    //Dp Top Down Approach
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];

        for(int i=0; i<m;i++){
            dp[i][0] = 1;
        }
        for(int j=0; j<n;j++){
            dp[0][j] =1;
        }

        for(int i=1; i<m;i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}


// Dp Approach T: O(N*M) S:(N*M)
// public int uniquePaths(int m, int n) {
//         int [][]mat = new int[m][n];
//         for(int [] row: mat){
//             Arrays.fill(row,-1);
//         }
//         return solve(m,n,mat,0,0);
//     }

//     public int solve(int m, int n, int [][]mat, int i, int j){
//         if(i==m-1 && j==n-1) return 1;
//         if(i <0 || i>=m || j>=n || j<0){
//             return 0;
//         }
//         if(mat[i][j] !=-1) return mat[i][j];

//         int right = solve(m,n,mat,i,j+1);
//         int down = solve(m,n,mat,i+1,j);

//         mat[i][j] = right+ down;
//         return mat[i][j];
//     }
// }