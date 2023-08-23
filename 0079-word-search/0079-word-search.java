class Solution {
    static boolean [][] visited;
    public boolean exist(char[][] board, String word) {
     visited = new boolean[board.length][board[0].length];

        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == word.charAt(0) && dfs(i,j,0,word,board))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, int idx, String word,char [][] board){
        if(idx== word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j]) return false;

        if(board[i][j] !=word.charAt(idx) ) return false;

        visited[i][j] = true;
       
            if(dfs(i +1,j,idx+1,word,board)
            || dfs(i-1,j,idx+1,word,board) || dfs(i,j+1,idx+1,word,board)
            || dfs(i,j-1,idx+1,word,board)){
                return true;
            }
        visited[i][j] = false;
        return false;

    }
}