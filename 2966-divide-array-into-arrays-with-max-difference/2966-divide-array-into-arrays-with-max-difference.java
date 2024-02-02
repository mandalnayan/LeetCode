class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        // Base case
        if (n < 3) return new int[0][0];
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int i = 0;
        while(i <= n-3) {
            int j = i;
            List<Integer> ls = new ArrayList<>();
            while(j < i+3) {
                if (nums[j]-nums[i] > k) return new int[0][0];
                ls.add(nums[j++]);
            }
            lists.add(ls);
            i += 3;
        }
        int res[][] = new int[lists.size()][3];
        int r = 0;
        for (List<Integer> subls : lists) {
            int c = 0;
             for(int num : subls) {
                 res[r][c++] = num;
             }
             r++;
        }
        return res;
    }
}