class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        // Base case
        if (n == 1) return 0;

        int lmin = prices[0];  // local minimum
        int lmax = lmin, maxProfit = 0; //local maximum 
         
        for (int i = 1; i < n; i++) {
            if (lmax < prices[i]) lmax = prices[i];
            else {
              maxProfit += lmax - lmin;
              lmin = prices[i];
              lmax = lmin;
            } 
        }
     
        maxProfit += lmax - lmin;
        return maxProfit;
    }
}