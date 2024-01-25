class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        List<String> ans = new ArrayList<>();        
        Map<Integer, String> map = new HashMap<>();
        mapping(map);
        List<String> num_ls = new ArrayList<>();
        for(char d : digits.toCharArray()) {
            String s = map.get(d-'0');
            num_ls.add(s);
        }
        rec(num_ls, 0, "", ans);
        return ans;
    }

    public void rec(List<String> num_ls, int ls_indx, String curStr, List<String> res_ls) {
        // Index out of bound 
        if (ls_indx >= num_ls.size()) {
           res_ls.add(curStr);
           return;
        }
        String num = num_ls.get(ls_indx);
        if (num == null) return ;
        int i = 0;
        while(i < num.length()) {
          rec(num_ls, ls_indx+1, curStr + num.charAt(i), res_ls);
          i++;
        }
    }

    public void mapping(Map<Integer, String> map) {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }
}