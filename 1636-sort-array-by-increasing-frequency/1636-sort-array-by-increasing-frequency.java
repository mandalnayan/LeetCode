class Solution {
    public int[] frequencySort(int[] nums) {
       int n = nums.length;
       if (n == 1) return nums;

       Map<Integer, Integer> map = new HashMap<>();
       for(int val : nums) {
           map.put(val, map.getOrDefault(val, 0)+1);
       } 
       // Storing into Priority queue
       PriorityQueue<List<Integer>> pq = new PriorityQueue<>((l1, l2)-> {
           if (l1.get(0) == l2.get(0)) return l2.get(1) - l1.get(1);
           else return l1.get(0) - l2.get(0);
           });

       for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
           List<Integer> ls = new ArrayList<>();
           ls.add(ele.getValue());
           ls.add(ele.getKey());
           pq.add(ls);
       }
       int i = 0;
       while(!pq.isEmpty()) {
           int f = pq.peek().get(0);
           int key = pq.poll().get(1);
           while(f-- > 0)
             nums[i++] = key;
       }
       return nums;
    }
}