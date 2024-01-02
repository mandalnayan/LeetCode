class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;

        // Base case
        if (n <= 1) return nums[0];
       
        int m = nums[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == m) count++;
            else count--;

            if (count < 0) {
                m = nums[i];
                count = 1;
            }
        }

        return m;

      /*
       // It takes O(nlogn) time
        Arrays.sort(nums);
        int element = nums[n/2];


        return element;
        */
    }
}