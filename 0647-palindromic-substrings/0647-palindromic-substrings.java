class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n == 1)return 1;

        int count = 0;
        boolean dp[][] = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int c = i, r = 0; r < n-i; c++, r++) {
                if(c == r){
                    dp[r][c] = true;
                    count++;
                } else if(s.charAt(r) == s.charAt(c)){ 
                     if(c-r+1 == 2  || dp[r+1][c-1]){
                       count++;
                       dp[r][c] = true;
                  } 
                 }
            }
        }
        return count;
     }

}