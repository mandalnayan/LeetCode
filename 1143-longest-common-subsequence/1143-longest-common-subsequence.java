class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(), n2 = text2.length();
        
        //Base case
        if (n1 == 1 && n2 == 1) {
            if (text1.equals(text2)) return 1;
            else return 0;
        }
        int dp[][] = new int[n1+1][n2+1];
        for(int i = 1; i <= n1; i++) {
            char ch = text1.charAt(i-1);
            for(int j = 1; j <= n2; j++) {
               if (ch == text2.charAt(j-1)) {
                   dp[i][j] = dp[i-1][j-1] + 1;
               } else {
                   dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
               }
            }
        }
        return dp[n1][n2];
    }
}