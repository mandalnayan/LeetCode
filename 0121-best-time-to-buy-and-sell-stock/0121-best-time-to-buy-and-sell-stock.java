class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        // Simple approach 
        /* find out the least possible day to buy stock and day to shell the 
         stock to get maximum profit */

         int lsf = prices[0];      // least so far
         int op = 0;               // overall profit
         
         for (int i = 1; i < n; i++) {
               if (lsf > prices[i]) {
                   lsf = prices[i];
               }
              
               op = Math.max(op, prices[i] - lsf);
         }
        
        return op;

        /*
        // Approach-1 bu using kaden`s algo
        int p[] = new int[n];
        
        p[n-1] = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
             p[i] = p[i+1] > prices[i] ? p[i+1] : prices[i];
        }

        int mp = 0;
        for (int i = 0; i < n-1; i++) {
           int cp = p[i+1] - prices[i];
             if (cp > mp) {
                 mp = cp;
             }
        }
        return mp;
        */
    }
}