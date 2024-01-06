class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
                
//  Optima solution using HashSet  => Time Complexity : O(n) | Space Complexity : O(1)
        HashSet<Integer> st1 = new HashSet<Integer> ();
        HashSet<Integer> st2 = new HashSet<Integer> ();
        
//  Coping of first array element in first HashSet
        int i = 0;
        while (i < n1) st1.add(nums1[i++]);
        
//  Coping of second array element in second HashSet
        i = 0;
        while (i < n2) st2.add(nums2[i++]);
    
        // Set<Integer> st3 = Sets.intersection(st1, st2);
        st2.retainAll(st1);
        
        int ans[] = new int[st2.size()];
        
        Iterator<Integer> it = st2.iterator();  
        i = 0;
        while (it.hasNext()) ans[i++] = it.next();
        
        return ans; 
    }
}
        /*         
        
//  Better solution using Sorting  => Time Complexity : O(nlogn) | Space Complexity : O(1)
       ArrayList<Integer> ls = new ArrayList<>();

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
*/