class Solution {
    public int uniquePaths(int m, int n) {
       return rec(m, n, 0, 0, new int[m][n]); 
    }

    public int rec(int m, int n, int r, int c, int dp[][]) {
        if (dp[r][c] != 0) return dp[r][c];
        if (r == m-1 || c == n-1) {
            dp[r][c] = 1;
        }
        else {
            dp[r][c] =  rec(m, n, r+1, c, dp) + rec(m, n, r, c+1, dp);
        }
        return dp[r][c];
    }
}