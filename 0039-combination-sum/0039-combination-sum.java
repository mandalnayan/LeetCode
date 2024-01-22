class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(candidates);
        rec(candidates, 0, target, ls, new ArrayList<>());
        return ls;
    }
    public void rec(int can[], int idx, int tar, List<List<Integer>> res_ls, List<Integer> ls) {
        if(tar == 0) {
            res_ls.add(new ArrayList<>(ls));
        }
        if(can[idx] > tar) return;
        while(idx < can.length) {
            if(can[idx] > tar) break;
            ls.add(can[idx]);
            rec(can, idx, tar-can[idx], res_ls, ls);
            ls.remove(ls.size()-1);
            idx++;
        }

    }
}