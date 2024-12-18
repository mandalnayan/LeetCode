class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int finalCost[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i+1;
            while (j < n && prices[j] > prices[i]) {
                j++;
            }
            
            finalCost[i] = j < n ? prices[i] - prices[j] : prices[i];
        }
        return finalCost;
    }
}