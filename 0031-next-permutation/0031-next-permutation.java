class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        
        for (int i = n-2 ; i >= 0; i--) {
            int j = i+1;
            int G = i;
            while (j < n) {
                if (nums[j] > nums[i]) G = j;
                j++;
            }
            if (G != i || G == 0) {
             int l = i, r = n-1;
             if (G != 0) {
                 int t = nums[G];
                 nums[G] = nums[i];
                 nums[i] = t;
                 l++;
             }
            while (l < r) {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
                r--;
            } 
                break;
            
        }
        }

    }
}