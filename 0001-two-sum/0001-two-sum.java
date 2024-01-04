class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        int res[] = new int[2];
        
//         Base case
        if (n == 2) {
            res[0] = 0;
            res[1] = 1;
        }
        
      loop1: 
        for (int i = 0; i < n; i++) {
           for (int j = i+1; j < n; j++) {
               if (nums[i]+nums[j] == target) {
                   res[0] = i;
                   res[1] = j;
                   break loop1;
               }
           }
       }       

        
        return res;
    }
}