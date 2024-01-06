class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        if (n <= 1) return n;
        
        Arrays.sort(nums);
        
        int ans = 1, curLen = 1;
        
        for (int i = 0; i < n-1; i++) {
            int cur =  nums[i];
            int next =  nums[i+1];
            
            if (cur == next) continue;
            else if (cur == next - 1) curLen++;
            else {
                ans = Math.max(curLen, ans);
                curLen = 1;
            }
        }
        
        
        
        return Math.max(curLen, ans);
    }
}