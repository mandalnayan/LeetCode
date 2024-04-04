class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean vis[] = new boolean[10];

        // Validate row wise
        for (int r = 0; r < n; r++) {
             Arrays.fill(vis, false);
            for (int c = 0; c < m; c++) {
                 if (board[r][c] == '.') continue; 
                 int indx = board[r][c]-'0';
                 if (vis[indx]) return false;
                 vis[indx] = true;
            }
        } 
        // Validate column wise
         for (int c = 0; c < m; c++) {
             Arrays.fill(vis, false);
             for (int r = 0; r < n; r++) {
                 if (board[r][c] == '.') continue; 
                 int indx = board[r][c]-'0';
                 if (vis[indx]) return false;
                 vis[indx] = true;
            }
            
        } 
        // Validate sub-matrix wise
        for (int r = 0; r < 3; r++) {
            for (int i = 0; i < 3; i++){
                Arrays.fill(vis, false);
                for (int c = i * 3; c < i * 3 + 3; c++) {
                     for (int ri = 0; ri < 3; ri++) {
                        if (board[r*3+ri][c] == '.') continue; 
                         int indx = board[r*3+ri][c]-'0';
                         if (vis[indx]) return false;
                         vis[indx] = true;
                     }
            }
        }
        }
        return true; 
    }
}