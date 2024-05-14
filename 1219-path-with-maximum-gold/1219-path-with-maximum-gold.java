class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int ans = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] != 0) {
                    ans = Math.max(ans, rec(grid, r, c, 0));
                }
            }
        }
        return ans;
    }
    public int rec (int [][]grid, int r, int c, int res) {
            if (r < 0 || c < 0 || r == grid.length || c == grid[0].length || grid[r][c] == 0) return res;
            
            int prevValue = grid[r][c];
            grid[r][c] = 0;
            res += prevValue;
            int leftRes = rec(grid, r, c-1, res);
            int rightRes = rec(grid, r, c+1, res);
            int upRes = rec(grid, r-1, c, res);
            int DowRes = rec(grid, r+1, c, res);

            grid[r][c] = prevValue;

            return (Math.max(Math.max(leftRes, rightRes), Math.max(upRes, DowRes)));
    }
}