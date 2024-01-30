class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      int n = arr.length;
      // Base case
    //  if (k == n) return 
      
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      int i = 0;
      while(i < n) {
        if (arr[i] >= x) break;
        pq.add(arr[i]);
        i++;
      }
      List<Integer> resultList = new ArrayList<>();
      while(resultList.size() != k && !pq.isEmpty()) {
        int val = pq.peek();
        if (i < n) {
          int b = arr[i];
          int res1 = Math.abs(val - x);
          int res2 = Math.abs(b-x);
          if (res1 > res2 || (res1 == res2 && val > b)) {
              val = b;
              i++;
          }
        }
         resultList.add(val);
         if (val == pq.peek()) pq.remove();
        }
      
      while(resultList.size() < k && i < n) 
               resultList.add(arr[i++]);
      Collections.sort(resultList);
      return resultList; 
    }

}