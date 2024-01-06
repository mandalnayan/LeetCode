class Solution {
    public int[] productExceptSelf(int[] A) {
        
        int n = A.length;
        
        int ans[] = new int[n];
        
//       Base case
        if (n == 2) {
            ans[0] = A[1];
            ans[1] = A[0];
            return ans;
        }
        
//      Calculating the multiplacation of whole array
        int mult = 1;
        int zeroC = 0;
        for (int i = 0; i < n; i++) {
             if (A[i] == 0) zeroC++;
             else {
                 mult *= A[i];
             }
            
             if (zeroC == 2) break;
            
        }
        
        if (zeroC == 2) return ans;
        
        for (int i = 0; i < n; i++) {
            if (zeroC == 1){
                if (A[i] == 0) {
                ans[i] = mult;
                break;
                }
            } else {
                ans[i] = (mult / A[i]);
            }
        }
        
        return ans;
    }
}
 /*       
//   ****      Brute force approach  => Time Complexity : O(n^2) | Space Complexity : O(1)
        
        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                else {
                    ans[i] *= A[j];
                    if (ans[i] == 0) break;
                }
            }
             
        }
        return ans;           

    }
}
*/