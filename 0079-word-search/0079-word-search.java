class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;

        // Base case
        if (m == 1 && n == 1) {
            if (word.length() == 1)
                return board[0][0] == word.charAt(0);
            return false;
        }
        
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(word.charAt(0) == board[i][j]) {
                   if(fun(board, word, 0, i, j)) return true;
                }
            }
        }
      return  false;
    }
    public boolean fun(char[][] b, String word, int idx, int r, int c) {
     if (idx == word.length()) return true;
     if(r < 0 ||  r >= b.length || c < 0 || c >= b[0].length ||
        !(word.charAt(idx) == b[r][c])) {
        return false;
     } 
     b[r][c]  = '1';
     idx++;
     if (fun(b, word, idx, r-1, c) || fun(b, word, idx, r, c+1) ||
         fun(b, word, idx, r+1, c) || fun(b, word, idx, r, c-1) ) {
         return true;
    }
    idx--;
    b[r][c]  = word.charAt(idx);
    return false;
    }
}