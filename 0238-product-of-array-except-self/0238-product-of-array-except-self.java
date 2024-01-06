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
        
// Optimal Approach    :: Time Complaxity : O(n) | Space Complexity : O(1)
// Approach : To get Product of array except ith = Multiply whole array and divide with ith elment
        
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
        
//      Handling with zeor value if it exist in the array
//      If at least two zeros, then multiplication of all element except self must be zero   
        if (zeroC == 2) return ans;
        else if (zeroC == 1) {       
            for (int i = 0; i < n; i++) {
                if (A[i] == 0) {
                ans[i] = mult;
                break;
                }
            }
        }
        else {        
        for (int i = 0; i < n; i++) {
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