class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int e = 1, i = 0;
        while (i < n) {
            if (nums[i] == e) e++;
            if (nums[i] > e) return e;
            i++;
        }
        return e;        
    }
}