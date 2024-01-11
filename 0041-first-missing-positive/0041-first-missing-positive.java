class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (val != i+1 && val > 0 && val <= n) {
                int indx = val - 1;
                if (nums[i] == nums[indx]) continue;
                int temp = nums[indx];
                nums[indx] = val;
                nums[i] = temp;
                i--;
            }
        }
        
        int i = 1;
        while (i <= n) {
            if (nums[i-1] != i) break;
            i++;
        }
        return i;
    }
}
        
        /*
        
    // Approach -1  Using HashMap || TimeComplexity : O(n)  | Space Complexity: O(n)
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        int i = 0;
        while (i < n) {
            if (nums[i] > 0) map.put(nums[i], true);
            i++;
        }
        int mp = 1;
        while (true) {
            if (!map.containsKey(mp)) break;
            mp++;
        }
        
        return mp;

    }
}

        
        /*
        // Using sorting , Time Complexit : O(nlogn) | Space Complexity : O(1)
        Arrays.sort(nums);
        int e = 1, i = 0;
        while (i < n) {
            if (nums[i] == e) e++;
            if (nums[i] > e) return e;
            i++;
        }
        return e;        
    }
}
*/