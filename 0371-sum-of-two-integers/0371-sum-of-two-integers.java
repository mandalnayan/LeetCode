class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {
          int k = a ^ b;  // a XOR b
          b = (a & b)<< 1;
          a = k;
        }
      return a;
    }
}