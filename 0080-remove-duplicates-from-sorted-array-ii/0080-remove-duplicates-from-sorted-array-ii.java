class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        
        //Base case
        if (n < 3) return n;

        int d = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[d-2]) {
                nums[d] = nums[i];
                d += 1;
            }
        }
        return d;

    }
}