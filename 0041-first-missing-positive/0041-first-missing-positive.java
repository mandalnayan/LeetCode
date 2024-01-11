class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Approach -1  Using HashMap
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