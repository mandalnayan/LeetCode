class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int n = s.length();

        // Base case

        rec(s, 0, ans, new ArrayList<>());   
        return ans;
    }
    public void rec(String s,int index, List<List<String>> ans, ArrayList<String> ls){
      if (s.length() == index) {
        ans.add(new ArrayList<String>(ls));
        return;
      }
      int i = index;
      while(i < s.length()) {
        if (isPlindrome(s,index, i)) {
          ls.add(s.substring(index,i+1));
          rec(s,i+1, ans, ls);
          ls.remove(ls.size()-1);
        }
        i++;          
      }       
    }
  
    boolean isPlindrome(String s, int l, int r) {
        while(l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;         
    }
}