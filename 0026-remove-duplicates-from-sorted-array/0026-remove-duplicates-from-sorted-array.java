class Solution {
    public int removeDuplicates(int[] nums) {
        
         int n = nums.length;

        //Base case-1
        if (n == 1) return 1;
        
        int i = 1, j = 1;

        while(j < n) {
            if (nums[i-1] != nums[j]) nums[i++] = nums[j];
            j++;
            }

            return i;
        }
}
    
