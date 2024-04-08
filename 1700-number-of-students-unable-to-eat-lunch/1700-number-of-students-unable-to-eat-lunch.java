class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      int cir = 0, sqr = 0, i = 0, n = students.length;
      while (i < n) {
        if (students[i] == 0) cir++;
        else sqr++;
        i++;
      }
      i = 0;
      while (i < n) {
        if (sandwiches[i] == 0) {
            if (cir == 0) return n - i;
            cir--;
        } else {
          if (sqr == 0) return n - i;
          sqr--;
        }
        i++;
      }
      
      return 0;
    }
}