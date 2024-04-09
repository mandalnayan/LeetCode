class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
      int n = tickets.length;
      
      if (n == 1) return tickets[0];
     
      int i = 0, count = 0;
      while (tickets[k] != 0) {
        if (tickets[i] != 0) {
          tickets[i] -= 1;
          count++;
        }
        i = (i+1) % n;
      }
      return count;
    }
}