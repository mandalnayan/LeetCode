class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      int n = strs.length;
      List<List<String>> resList = new ArrayList<>();
      
      if (n == 1) {
        List<String> ls = new ArrayList<>();
        ls.add(strs[0]);
        resList.add(ls);
        return resList;
      }
      
      HashMap<Map<Character, Integer>, List<String>> listMap = new HashMap<>();
      int i = 0;
      while (i < n) {
        String curStr = strs[i++];
        Map<Character, Integer> map = mapping(curStr);
        List<String> ls = listMap.getOrDefault(map, new ArrayList<String>());
        ls.add(curStr);
        listMap.put(map, ls);
        /*
        if (listMap.containsKey(map)) {
           listMap.put(map,  ls);
        } else {
          listMap.put(map, new)
        }
        */
      }
      for(List<String> ls : listMap.values()) {
        resList.add(ls);
      }
      return resList;      
    }
  public Map<Character, Integer> mapping(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
         map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    return map;
  }
}