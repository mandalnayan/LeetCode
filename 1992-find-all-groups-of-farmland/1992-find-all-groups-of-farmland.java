class Solution {
    public int[][] findFarmland(int[][] land) {
       int rows = land.length, columns = land[0].length;
       List<List<Integer>> ls = new ArrayList<>();
      
      int r = 0, c = 0;
       while(r < rows) {
        c = 0;
        while(c < columns) {
            if (land[r][c] == 1 && (r == 0 || land[r-1][c] == 0) && (c == 0 || land[r][c-1] == 0)) {
            int or = r;
            List<Integer> curLs = new ArrayList<>();
            curLs.add(r);
            curLs.add(c);
            // Move rightmost
            while (c < columns && land[r][c] == 1)  {
                land[r][c] = -1;
                c++;
            }   
            c--;
            r++;
            // Move downmost
            while (r < rows && land[r][c] == 1)  {
                land[r][c] = -1;
                r++;
            } 
            r--;
            curLs.add(r);
            curLs.add(c);
            ls.add(curLs);
              r = or;
          } 
            c++;
        }
       r++;
       }

       int farmLand[][] = new int[ls.size()][4];
        r = 0;
       for (List<Integer> curLs : ls) {
          farmLand[r][0] = curLs.get(0);
          farmLand[r][1] = curLs.get(1);
          farmLand[r][2] = curLs.get(2);
          farmLand[r][3] = curLs.get(3);
          r++;
       }
       return farmLand;
    }

       void rec(int land[][], int r, int c, int rows, int columns, List<Integer> curLs) {
        if (r == rows || columns == c || land[r][c] == 0) return;

        land[r][c] = -1;
        rec (land, r, c+1, rows, columns, curLs);
        if (curLs.size() < 4 && (r+1 == rows || land[r+1][c] == 0)) {
               curLs.add(r);
               curLs.add(c);
               return;
        } else {
        rec (land, r+1, c, rows, columns, curLs);

        }
       }

}