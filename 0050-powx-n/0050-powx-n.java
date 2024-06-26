class Solution {
    public double myPow(double x, int n) {
     // Base case
      if (x == 1 || n == 1) return x;
       
      if (n < 0) {
        n = -n;
        x = 1 / x;
      }
      
      double pow = 1;
      while (n != 0) {
           if ((n & 1) != 0) {
            pow *= x;
           }
           x *= x;
           n = n >>> 1;
      }
      
     return  pow;   
    }
}