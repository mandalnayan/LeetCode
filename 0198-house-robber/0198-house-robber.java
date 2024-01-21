class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return  nums[0];
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] = nums[n-1];
        return rec(nums, n, 0, dp);
    }
    int rec(int[]A, int n, int indx, int dp[]){
        if(indx >= n) return 0;
        if(dp[indx] != -1) return dp[indx];
        dp[indx] = Math.max(A[indx]+rec(A,n,indx+2,dp),  rec(A,n,indx+1,dp));
        return dp[indx];
    }
}