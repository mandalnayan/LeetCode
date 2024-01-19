class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int n = s.length();

        // Base case

        rec(s, ans, new ArrayList<>());   
        return ans;
    }
    public void rec(String s, List<List<String>> ans, ArrayList<String> ls){
      if (s.length() == 0) {
        ans.add(new ArrayList<String>(ls));
        return;
      }
      int i  =  1;
      while(i <= s.length()) {
        if (isPlindrome(s.substring(0, i))) {
          ls.add(s.substring(0, i));
          rec(s.substring(i), ans,ls);
          ls.remove(ls.size()-1);
        }
        i++;          
      }       
    }
  
    boolean isPlindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;         
    }
}