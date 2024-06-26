class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int trib[] = new int[n];
        trib[0] = 0; 
        trib[1] = 1;
        trib[2] = 1;
        
        int i = 3;
        while (i < n) {
            trib[i] = trib[i-1] + trib[i-2] + trib[i-3];
            i++;
        }
        return (trib[n-1] + trib[n-2] + trib[n-3] );
    }
}