class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        
//         Base case
        if (n == 1) return nums[0];
        
        int maxSum = Integer.MIN_VALUE;
         
//       Optimized approach
        int s = 0, e = 0, curS = 0;
        while (e < n) {
            if (curS >= 0) curS += nums[e];
            
            maxSum = Math.max(curS, maxSum);
            if (curS < 0) {
                curS -= nums[s++];   
                if (s > e) e = s;
            } else {
                e++;
            } 
        }
        return maxSum;
    }
}
        
/* Brute force approach => T.C - O(n^2) && S.C = O(1)        
        
//      Generating all possible subarray and 
//      calculate sum of each subarray
        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                curSum += nums[j];
                
//              checking if curSum is greater than maxSum then update value of maxSum
                maxSum = Math.max(curSum, maxSum);
            }
        }
        
        return maxSum;        
     
    }
}
*/