class Solution {
    public int numIslands(char[][] grid) {
       int rows = grid.length, columns = grid[0].length;
       // Base case
       if (rows == 1 && columns == 1) return grid[0][0] - '0';
       
       int count = 0;
       for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                 if (grid[r][c] == '1') {
                    count++;
                    DFS(grid, r, c);
                 }
            }
       }
       return count;
    }
    //Direction of movement
    int moves[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private void DFS(char grid[][], int r, int c) {
        // Outside grid area
        if (r < 0 || c < 0 || r == grid.length || c == grid[0].length ||
           grid[r][c] == '0' || grid[r][c] == '#') return ;
       
        // mark visited
         grid[r][c] = '#';
         
        // Move in four direction
        for (int m = 0; m < 4; m++) {
            DFS(grid, r+moves[m][0], c+moves[m][1]);
        }
    }
}