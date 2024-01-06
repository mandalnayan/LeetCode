class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        ArrayList<Integer> ls = new ArrayList<>();
        
        for (int i = 0; i < n1; i++) {
            
        for (int j = 0; j < n2; j++){
            if (nums1[i] == nums2[j]){
                 if (nums2[j] != -1 && !ls.contains(nums2[j]))
                     ls.add(nums1[i]);
                 else nums2[j] = -1;
                
                break;
            }
        } 
      }
        
        int ans[] = new int[ls.size()];
        int i = 0;        
        while (i < ls.size()) ans[i] = ls.get(i++);
        
        return ans;        
        
    }
}