class Solution {
    public int findKthLargest(int[] nums, int k) {
     int n = nums.length;
      if(n == 1) return nums[0];
      
      Queue<Integer> qu = new PriorityQueue<>();
      int i = 0;
      while(i < k) {
        qu.add(nums[i++]);
      }
      while(k < n) {
        int val = nums[k++];
        if(val > qu.peek()) {
          qu.remove();
          qu.add(val);
        }
      }
return qu.peek();
      
    }
}