class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        
        int ans = 0, max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            if (i == max) ans++;
        
        }
        return ans;
    }
}