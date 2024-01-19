class Solution {
    public int minFallingPathSum(int[][] matrix) {
      int n  =  matrix.length, ans = Integer.MAX_VALUE;
      int dp[][] = new int[n][n];
      for (int i = 0; i < n; i++) 
        Arrays.fill(dp[i], Integer.MAX_VALUE);

      for (int i = 0; i < n; i++) {
          ans = Math.min(findingPath(matrix,  n,  0, i,dp), ans);
      }
      return ans;
    }
    
  public int findingPath(int[][]m, int n, int r, int c, int dp[][]) {
    if(r == n-1) return m[r][c];

    if (dp[r][c] != Integer.MAX_VALUE) return dp[r][c];
     
     int min_sum = Integer.MAX_VALUE;
     if (c > 0)
     min_sum = Math.min(findingPath(m, n, r+1, c-1, dp), min_sum);
     min_sum = Math.min(findingPath(m, n, r+1, c, dp), min_sum);
     if (c < n-1)
     min_sum = Math.min(findingPath(m, n, r+1, c+1, dp), min_sum);
     
    dp[r][c] = min_sum + m[r][c];
    return dp[r][c];
  }
}
