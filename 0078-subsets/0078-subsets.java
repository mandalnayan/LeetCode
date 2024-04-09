class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        rec(nums, 0, new ArrayList<>(), ansList); 
        return ansList;
    }

    public void rec(int nums[], int idx, ArrayList<Integer> curList, List<List<Integer>> ansList) {
       if (idx == nums.length) {
           ansList.add(new ArrayList<>(curList));
           return ;
       }
        // Include
         curList.add(nums[idx]);
         rec(nums, ++idx, curList, ansList);
         // Not Include
         curList.remove(curList.size()-1);
         rec(nums, idx, curList, ansList);
       
    }
}