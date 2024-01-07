class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
//         Base case
        if (n == 1) return;
        
        int cz = 0;
        int i = 0;
        while (i < n) if (nums[i++] == 0) cz++;
        
        int c1 = 0;
        i = 0;
        while (i < n) if (nums[i++] == 1) c1++;
              
        i = 0;
        while (cz-- > 0)nums[i++] = 0;
        while (c1-- > 0)nums[i++] = 1;
        while (i < n)nums[i++] = 2;


               
    }
}