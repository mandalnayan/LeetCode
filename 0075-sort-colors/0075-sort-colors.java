class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
//         Base case
        if (n == 1) return;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (nums[j] < nums[j-1]) {
                    int t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                }
            }
        }
    }
}