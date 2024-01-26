class Solution {
    int moves[][] = {{-1,0}, {0, 1},
                    {1, 0}, {0, -1}
                        };
    int md = (int)Math.pow(10, 9) + 7;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       // Base case
       if (maxMove == 0) return 0;
       int dp[][][] = new int[m][n][maxMove+1];
    //    Initialize array with -1
       for(int i = 0; i < m; i++) {
           for(int j = 0; j < n; j++) {
               for(int k = 0; k <= maxMove; k++) {
                   dp[i][j][k] = -1;
               }
           }
       }
       return rec(m, n, maxMove, 0, startRow, startColumn,  dp);  
    }

    public int rec(int m, int n, int maxMove, int cm, int sr, int sc, int dp[][][]) {
        //Boundary condition
        if (sr < 0 || sc == n || sr == m || sc < 0 ) return 1;
        if (cm == maxMove) return 0;

        if (dp[sr][sc][cm] != -1) return dp[sr][sc][cm];
        long MaxCount = 0;
            for(int i = 0; i < 4; i++) {
            MaxCount += rec(m, n, maxMove, cm+1, sr + moves[i][0], sc + moves[i][1],dp);
            MaxCount %= md;
            }
        
        dp[sr][sc][cm] = (int)(MaxCount % md);
        return (int)MaxCount;
    }
    }
