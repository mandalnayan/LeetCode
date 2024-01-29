class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        this.k = k;
        int i = 0;
        while(i < k && i < nums.length) {
            pq.add(nums[i++]);
        }
        while(i < nums.length) {
            int curVal = nums[i++];
            if (pq.peek() < curVal) {
                pq.remove();
                pq.add(curVal);
            }
        }
    }
    
    public int add(int val) {
        if (k > pq.size()) {
            pq.add(val);
        } else {
            if (pq.peek() < val) {
                pq.remove();
                pq.add(val);
            }
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */