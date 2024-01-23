class Solution {
    public int maxLength(List<String> arr) {
        int n = arr.size();
        // Base case
        if (n == 1) {
            String s = arr.get(0);
            Set<Character> st1 = makeSet(s);
            if (st1 == null) return 0;
            return s.length();
        }
        return rec(arr, 0, new HashSet<Character>(), 0);
    }
    public int rec(List<String>ls, int indx, Set<Character> set, int maxLen) {
     if (indx >= ls.size()) return set.size();
     while(indx < ls.size()) {
         Set<Character> set2 = makeSet(ls.get(indx));
         if (set2 != null && !isContains(set, set2)) {
             Set<Character> set3 = new HashSet<>(set);
             set.addAll(set2);
             //Include ith string
             maxLen = Math.max(rec(ls, indx+1, set, maxLen), maxLen);
             //Not include ith string
             maxLen = Math.max(rec(ls, indx+1, set3, maxLen), maxLen);
         }
         indx++;
     }
      return Math.max(maxLen, set.size());
    }
    public Set<Character> makeSet(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        for(char ch : s.toCharArray()) {
            if (set.contains(ch)) return null;
            set.add(ch);
        }
        return set;
    }
    //Finding is any character of set2 is present in the set 1
    public boolean isContains(Set<Character>st1, Set<Character>st2) {
        for(Character ch : st2) {
            if(st1.contains(ch)) return true;
        }
        return false;
    }
}