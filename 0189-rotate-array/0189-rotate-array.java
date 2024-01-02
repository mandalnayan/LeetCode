class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        
//      Base case
        if (k == 0 || n == 1 || k == n) return ;
        
//      temporary array
        int temp[] = nums.clone();
        
        int j = 0;
        
        if (k > n){
           k = k%n;            
        }
        
//      Coping from k-element from right side
        for (int i = n-k; i < n; i++) {
            nums[j++] = temp[i];
        }  
        
//      coping 0 to n-k element after kth element
        for (int i = 0; i < n-k; i++) {
            nums[j++] = temp[i];
        }
        
    }
}