class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        
//      Base case
        if (n == 1) return false;
        
//      Optimized appraoch using "Sorting"  => T.C : O(nlogn) (bec. of sorting)
        
        Arrays.sort(nums);
        
        for (int i = 0; i < n-1; i++) 
            if (nums[i] == nums[i+1]) return true;
        
        return false;
        
        }
} 
/*         
//      Brute force approach ==> T.C : O(n^2) && S.C = O(1)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//                 is ith element present twice, if "Yes" then return true;
                   if (nums[i] == nums[j]) return true;
                
            }
        }
        
        return false;
        */
