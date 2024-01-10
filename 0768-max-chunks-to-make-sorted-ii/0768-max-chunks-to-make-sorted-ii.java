class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 1;
       
    //    Calculating left max
    int leftMax[] = new int[n];
    leftMax[0] = arr[0];
    for (int i = 1; i < n; i++) {
    leftMax[i] = Math.max(arr[i], leftMax[i-1]);
    }
    //   Calculating right min
    int rightMin[] = new int[n];
    rightMin[n-1] = arr[n-1];

    for (int i = n-2; i >= 0; i--) {
    rightMin[i] = Math.min(arr[i], rightMin[i+1]);
    }
    
        int ans = 0;
        int i = 0;
        while (i < n-1) {
            if (leftMax[i] <= rightMin[i+1]){
                   ans++;
               }
               i++;
        }
        
        return ans+1; 
        
    }
}