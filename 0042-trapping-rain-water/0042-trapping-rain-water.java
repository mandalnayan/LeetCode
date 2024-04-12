class Solution {
    public int trap(int[] height) {
        int n = height.length, ml = height[0], mr = height[n-1], w = 0, l = 0, r = n-1;
      while (l < r) {
        // Left side
        if (ml <= mr) {
        if (height[l] <= ml) {
          w += ml - height[l++];
        } else {
          ml = height[l];
        }
        } else {
        // Right side
        if (height[r] <= mr) {
          w += mr - height[r--];
        } else {
          mr = height[r];
        }
        }
      }
      return w;
        
    }
}