class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        
        List<List<Integer>> res_ls = new ArrayList<>();
        
//       Base case        
        if (n == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                ArrayList<Integer> ls = new ArrayList<>();
                
                ls.add(nums[0]);
                ls.add(nums[1]);
                ls.add(nums[2]);
                
                res_ls.add(ls);
                
            }
            return res_ls;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++){      
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1, r = n-1;
        
            while (l < r) {
                  if (l > i+1 && nums[l] == nums[l-1]) {
                      l++;
                      continue;
                  } else if (r < n-1 && nums[r] == nums[r+1]) {
                      r--;
                      continue;
                  } else {
                      int a = nums[i];
                      int b = nums[l];
                      int c = nums[r];
                      
                      int s = a+b+c;
                      if (s == 0) {
                          ArrayList<Integer> ls = new ArrayList<>();
                          ls.add(a);
                          ls.add(b);
                          ls.add(c);
                          l++;
                          r--;
                          res_ls.add(ls);
                      } else if (s < 0) l++;
                      else {
                          r--;
                      }

                  }
          }
        }
        return res_ls;
    }
}
        
        
        /*
        
                
        for (int i = 0; i < n; i++) {
             int f = 0 - nums[i];
            
            for (int j = i+1; j < n; j++) {
                 int s = f - nums[j];
                
                for (int k = j+1; k < n; k++) {
                    if (nums[k] == s) {
                    ArrayList<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(s);
                
                   res_ls.add(ls);
                    }
                }
            } 
        }
        
        int i = 0;
        while (i < res_ls.size()) {
            List<Integer> ls = res_ls.get(i);
            
            
            int j = i+1;
            while (j < res_ls.size()) {
               List<Integer> t = res_ls.get(j);

                int a = ls.get(0);
                int b = ls.get(1);
                int c = ls.get(2);

               if (t.contains(a) && t.contains(b) && t.contains(c) && ls.contains(t.get(0))                   == ls.contains(t.get(1)) && ls.contains(t.get(2))) {
                  res_ls.remove(j);
                   } else {
                   j++;
               }
               }
              i++;
            }
        
        return res_ls;
    }
}
*/