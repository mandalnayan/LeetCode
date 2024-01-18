class Solution {
    public int climbStairs(int n) {
      if (n <= 3) return n;
      
      // Using dynamic programming
      int dp[] = new int[n+1];
      Arrays.fill(dp, -1);
      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 2;
      dp[3] = 3;
      
      return rec(n, dp);
     }
  public int rec(int n, int dp[]) {
    if(dp[n] != -1) return dp[n];
    int val = rec(n-1, dp) + rec(n-2, dp);
    dp[n] = val;
    return val; 
  }
}