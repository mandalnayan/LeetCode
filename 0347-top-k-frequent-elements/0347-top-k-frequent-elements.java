class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int n = nums.length;
      // Base case
      if (n <= 1) return nums;
      
      Map<Integer, Integer> map = new HashMap<>();
      
      for (int i = 0; i < n; i++) {
        int key = nums[i];
        map.put(key, map.getOrDefault(key, 0)+1);
      }
          
      Iterator <Map.Entry<Integer, Integer>>itr = map.entrySet().iterator();
      PriorityQueue<List<Integer>> qu = new PriorityQueue<>((l1, l2)-> l2.get(0) - l1.get(0));
      while(itr.hasNext()) {
        Map.Entry<Integer, Integer> ele = itr.next();
        int curVal =  ele.getValue();
        int key = ele.getKey();
        List<Integer> curls = new ArrayList<>();
        curls.add(curVal);
        curls.add(key);
        qu.add(curls);
      }

      int ans[] = new int[k];
      int i = 0;
      while(k> i) {
       ans[i++] = qu.remove().get(1);
      }
      
      return ans;
    }
}