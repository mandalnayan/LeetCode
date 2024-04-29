class Solution {
    public int minOperations(int[] nums, int k) {
       int count = 0, finalXor = 0; 
       
       // Find XOR of all element
       for (int num : nums) {
           finalXor ^= num;
       }
       System.out.println(finalXor);
       // Either finalXor will 0 or K will 0
       while (finalXor != 0 || k != 0) {
          if (finalXor % 2 != k % 2) count++;
          finalXor /= 2;
          k /= 2;
       }
       return count;
    }
}
       /* Approach 2
       for (int i = 1; i < nums.length; i++) {
          if (nums[i] > nums[max]) max = i;
       }
        int j = 1;
        while(j++ <= 20) {
            int xr = nums[0] % 2;
            nums[0] /= 2;
            for (int i = 1; i < nums.length; i++) {
             xr ^= nums[i] % 2;
             nums[i] /= 2;
           }
           if (xr != k%2) count++;
           k /= 2;
       }

       return count; 
    }
}
*/