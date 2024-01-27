class Solution {
    public int kInversePairs(int n, int k) {
       //Base case
       if (k == 0) return 1;
       int dp[][] = new int[n+1][k+1];
       int md = (int)Math.pow(10, 9) + 7;
       dp[0][0] = 1;

       for(int r = 1; r <= n; r++) {
          // dp[r][0] = 1;
           int c = 0;
           long val = 0;
           while(c <= k) {
                val += dp[r-1][c];
                if (c >= r) {
                 val -=  dp[r-1][c-r];
               }
               dp[r][c] = (int)(val % md);
               c++;
           } 
       }
       return dp[n][k];
    }
}