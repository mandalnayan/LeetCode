class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         Base case
        if (m == 0 && n == 0) return;
        
        int i1 = m-1, i2 = n-1, k = m+n-1;
        
        while (i1 >= 0 && i2 >= 0) {
            if (nums1[i1] > nums2[i2]) nums1[k] = nums1[i1--];
            else {
                nums1[k] = nums2[i2--];
            }
            k--;
        }
        if (i2 >= 0) {
            while (i2 >= 0) nums1[k--] = nums2[i2--];
        }
    }
}