class Solution {
    public int findMaxK(int[] nums) {
      int n = nums.length;
      if (n == 1) return -1;
      
      Arrays.sort(nums);
      
      int leftPtr = 0, rightPtr = n-1;
      while (leftPtr < rightPtr) {
        int sum = nums[rightPtr] + nums[leftPtr];
        if (sum == 0) return nums[rightPtr];
        else if (sum > 0) rightPtr--;
        else leftPtr++;
      }
      return -1;
    }
}