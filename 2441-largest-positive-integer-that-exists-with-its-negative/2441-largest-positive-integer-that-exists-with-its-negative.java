class Solution {
    public int findMaxK(int[] nums) {
      int n = nums.length;
      if (n == 1) return -1;
      int ans = -1;
      HashSet<Integer> set = new HashSet<>();
     for (int num : nums) {
            num *= -1;
          if (set.contains(num)) ans = Math.max(Math.abs(num), ans);
          else set.add(num*(-1));
         
     }
      return ans;
    }
}