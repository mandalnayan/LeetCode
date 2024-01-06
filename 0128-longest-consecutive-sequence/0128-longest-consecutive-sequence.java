class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        if (n <= 1) return n;
                 
//      Optimal Solution using HashSet | Time Complexity : O(n) | Space Complexity : O(n)
        
        HashSet<Integer> map = new HashSet<>();
        
        for (int i = 0; i < n; i++) 
              map.add(nums[i]);
        
        int ans = 1, i = 0;
        while (i < n) {
            
            int CV = nums[i];
            
//       checking is it's previous value present, if not then curent value is starting point
            if (!map.contains(CV - 1)) {
                
                int CL = 1;
                
                while (map.contains(CL + CV))  CL++;
                
                                
                ans = Math.max(CL, ans);
            }
            i++;
        }
        
        return ans;
    }
}
        
        
        /*
        // Better solution using "Sorting" | Time Complexity : O(nlogn) | Space Complexity : O(1)
         Arrays.sort(nums);
         
        for (int i = 0; i < n-1; i++) {
            int cur =  nums[i];
            int next =  nums[i+1];
            
            if (cur == next) continue;
            else if (cur == next - 1) curLen++;
            else {
                ans = Math.max(curLen, ans);
                curLen = 1;
            }
        }
        
        
        
        return Math.max(curLen, ans);
    }
}
*/