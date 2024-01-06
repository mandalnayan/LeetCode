class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        ArrayList<Integer> ls = new ArrayList<>();
        
//  Better solution using Sorting  => Time Complexity : O(nlogn) | Space Complexity : O(1)
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i1 = 0, i2 = 0;
        while (i1 < n1 && i2 < n2) {            
            if(i1 > 0 && nums1[i1] == nums1[i1-1]) {
                i1++;
                continue;
            }
            else if (nums1[i1] == nums2[i2] ) {
                ls.add(nums1[i1]);
                i1++;
                i2++;
            }else if(nums1[i1] < nums2[i2]) i1++;
            else i2++;
        }
        
        int ans[] = new int[ls.size()];
        int i = 0;        
        while (i < ls.size()) ans[i] = ls.get(i++);
        
        return ans; 
    }
}
/*
// Brute force approach using nested loop; => Time Complexity : O(nlogn) | Space Complexity : O(1)
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
*/