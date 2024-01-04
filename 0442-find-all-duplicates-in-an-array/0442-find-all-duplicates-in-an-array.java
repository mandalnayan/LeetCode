/*
We keep on storing element in Hashmap and while storing we also check is it already present on Hashmap,
if Yes then we store that element in "Result_List", and we marked as this element is stored by replacing that element with 0.

At the end return Resutl_List.
 */   

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        
        List<Integer> resList = new ArrayList<Integer>();

        if (n == 1) return resList;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) continue;

            if (map.containsKey(nums[i])) {
                resList.add(nums[i]);

                nums[i] = 0;
            } else {
                map.put(nums[i], 1);
            }
        }

        return resList;
    }
}