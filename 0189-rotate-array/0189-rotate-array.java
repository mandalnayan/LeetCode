class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k %= n;

//      Base case
        if (k == 0 || n == 1 || k == n) return ;
        
        // Approach-1 simple java solution
        // 1 -> Rotate complete array
        // 2 -> Rotate 0 to k element
        // 3 -> ROtate n-k to n element
        
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    void reverse(int nums[], int s, int e) {
        while(s < e) {
            int t = nums[s];
            nums[s++] = nums[e];
            nums[e--] = t;
        }
    }
}

/*
    //  Approach-2 Rotate k element k time
    for (int i = 0; i < k; i++) {
         int ls = nums[n-1];
         for (int j = n-1; j > i; j--) {
             nums[j] = nums[j-1];
         }
         nums[i] = ls;
    }
    
/*
        // Approach-3 using extra array T.C = O(n) && S.C =O(n)
//      temporary array
        int temp[] = nums.clone();
        
        int j = 0;
        
        if (k > n){
           k = k%n;            
        }
        
//      Coping from k-element from right side
        for (int i = n-k; i < n; i++) {
            nums[j++] = temp[i];
        }  
        
//      coping 0 to n-k element after kth element
        for (int i = 0; i < n-k; i++) {
            nums[j++] = temp[i];
        }
        
    }
}
*/