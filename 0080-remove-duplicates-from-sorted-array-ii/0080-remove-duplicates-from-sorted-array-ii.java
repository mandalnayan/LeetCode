class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;

        if (n < 3) return n;

        //Code-1
        int d = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[d-2]) {
                nums[d] = nums[i];
                d += 1;
            }
        }
        return d;

        //Code-2   
        /*  
        int k = 0, count = 1;
        for (int j = 1; j < n; j++) {
              if (nums[k] != nums[j]) {
                  if (count > 2) {
                      nums[k] = nums[j];
                  } else{
                       k++;
                       nums[k] = nums[j];
                  }
              count = 1;
              } else {
                  if(count <= 2) {
                  count++;
                  nums[++k] = nums[k-1];
                  }
              }
        }
      
      if (count <= 2) k++;
      return k;
     
*/
       //Code -3
       /*
        int l = 0, count = 1, r = 1, prev = nums[0];
        while (r < n) {
            if (count < 2 && nums[r] > prev) {
                count = 1;
                prev = nums[r];
            } 

           else if (count >= 2) {
                 while (r < n && nums[r] == prev) r++;
                 
                 if (r == n) return l;
                 int t = nums[l];
                 nums[l] = nums[r];
                 nums[r] = t;
                 prev = nums[l];
                 count = 1;
            } else if (nums[l] == nums[r]) {
                count++;
            } else if(nums[l] < prev) {
                    while (r < n && nums[r] < prev) r++;

                    if (r == n) return l;

                    int t = nums[l];
                    nums[l] = nums[r];
                    nums[r] = t;

                    if (nums[l] == prev) count++;
                    else {
                         prev = nums[l];
                         count = 1;
                    }
            }
            l++;
            r++;
        }
        
     return l;
     */
    }
}