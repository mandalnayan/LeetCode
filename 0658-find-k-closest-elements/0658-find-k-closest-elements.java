class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      int n = arr.length;
      List<Integer> resLs = new ArrayList<>();
      int idx = search(arr, n-k, x);
      int r = idx, l = idx-1;
      // expand the left and right window
      while(k-- > 0) {
          if (l < 0 || (r < n && arr[r] - x < x-arr[l])) r++;
          else l--;
      }
      l++;
      while(l < r) resLs.add(arr[l++]);
      return resLs; 
    }
    int search(int arr[], int n, int x) {
        int l = 0, r = n;
        while(l <= r) {
            int m = (l+r)/2;
            if (arr[m] == x) return m;
            else if (arr[m] < x) l = m+1;
            else r = m-1;
        }
        return l;
    }

}