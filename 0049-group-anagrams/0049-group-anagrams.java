class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res_ls = new ArrayList<>();
        int n = strs.length;
        //Base case
        if(n == 1) {
            List<String> ls = new ArrayList<>();
            ls.add(strs[0]);
            res_ls.add(ls);
            return res_ls;
        } 
        Map<Map<Character, Integer>, List<String>> map_list = new HashMap<>();
        int i =  0;
        while(i < n) {
            Map<Character, Integer> map = convert_map(strs[i]);
            if(!map_list.containsKey(map)) {
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map_list.put(map, ls);
            } else {
             map_list.get(map).add(strs[i]);
            }
            i++;
        }
        for (List<String> ls : map_list.values()){
               res_ls.add(ls);
        }
        return res_ls;
    }

    public Map<Character, Integer> convert_map(String s) {
        Map<Character, Integer> map =  new HashMap<>();
        int i = 0, n = s.length();
        while(i < n) {  
            char ch = s.charAt(i++);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        return map;
    }
}