class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        //Base case
        if(n == 1) return arr[0];
        
        int NSL[] = new int[n];   //Next Smallest Left
        int NSR[] = new int[n];  // Next Smallest Right
        //Initialize  Next Smallest Left
        NSL[0] = -1;
        for(int i = 1; i < n; i++) {
            int j =  i-1;
            while(j >= 0) {
              if(arr[j] < arr[i]) break;
            j--;
            }
            NSL[i] = j;
        }
        //Initialize  Next Smallest Right
        NSR[n-1] = n;
        for(int i = n-2; i >= 0; i--) {
            int j =  i+1;
            while(j < n) {
              if(arr[j] <= arr[i]) break;
            j++;
            }
            NSR[i] = j;
        }
         long ans = 0 , mod = (int)(Math.pow(10,9)+7);
         for(int i = 0; i < n; i++) {
             long total_substring = (i - NSL[i])*(NSR[i]-i);
             ans = (ans + (total_substring)*arr[i]) % mod;
        }
        return (int)ans;
    }
}