class Solution {
    public int[][] merge(int[][] intervals) {
       int n = intervals.length;
       // Sort the array
       Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));
       
       List<List<Integer>> intrv = new ArrayList<>();
       for (int i = 0; i < n; i++) {
          ArrayList<Integer> ls = new ArrayList<>();
          ls.add(intervals[i][0]);
          ls.add(intervals[i][1]);
          intrv.add(ls);
       }

       int i = 0;
       while (i < intrv.size() - 1) {
             List<Integer> Fls = intrv.get(i), SndLs = intrv.get(i+1);
             
             if (Fls.get(0) <= SndLs.get(0) && SndLs.get(0) <= Fls.get(1)) {
                  if (SndLs.get(1) <= Fls.get(1)) intrv.remove(i+1);
                  else {
                    Fls.set(1, SndLs.get(1));
                    intrv.set(i, Fls);
                    intrv.remove(i+1);
                  }
                  i--;
             } 
             i++;
    }
    i = 0;
    int res[][] = new int[intrv.size()][2];
    for (List<Integer> ls : intrv) {
        res[i][0] = ls.get(0);
        res[i++][1] = ls.get(1);
    }
    return res;

}
}