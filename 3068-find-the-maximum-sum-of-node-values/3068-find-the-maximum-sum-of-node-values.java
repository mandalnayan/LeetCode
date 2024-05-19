class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
       long sum = 0;
       int minNeg = Integer.MAX_VALUE, count = 0;
                         
       for (long num : nums) {
        if ((num^k) > num) {
            sum += num^k;
            count++;
        } else {
            sum += num;
        }
        minNeg = (int)Math.min(minNeg, Math.abs(num - (num^k)));
       } 

       if (count % 2 == 0) return sum;
       return sum - minNeg;
    }
}