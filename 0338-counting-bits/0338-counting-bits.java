class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        if (n == 0) {
            return arr;
        }
        for(int i = 1; i <= n; i++) {
           arr[i] = (arr[i >> 1])+ (i & 1);
        }
        return arr;
    }
}