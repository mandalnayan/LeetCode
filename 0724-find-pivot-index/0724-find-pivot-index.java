class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
//      Base case
        if (n == 1) return 0;
        
//       Finding right sum
        int rs = 0;
        for (int j = 0; j < n; j++) rs += nums[j];
        
        int ls = 0;
        for (int i = 0; i < n; i++) {
            rs -= nums[i];
            if (ls == rs) return i;
            ls += nums[i];
        }
        return -1;
    }
}