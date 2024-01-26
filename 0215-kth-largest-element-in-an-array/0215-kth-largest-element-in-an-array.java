class Solution {
    public int findKthLargest(int[] nums, int k) {
     int n = nums.length;
      if(n == 1) return nums[0];
      
      Queue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
      int i = 0;
      while(i < n) {
        qu.add(nums[i++]);
      }
      while(k-- > 1) {
        qu.remove();
      }
      return qu.peek();
      
    }
}