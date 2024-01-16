class Solution {
    public String longestCommonPrefix(String[] strs) {
      
      int n = strs.length;
      
      //Base case-1
      if (n == 1) return strs[0];
      
      String LCP = "";   // Longest_Common_Prefix
      int i = 0, len = 0;
      String fs = strs[i];
      while(i < fs.length()) {              
           char ch = fs.charAt(i);
           int j = 1;
           while (j < n) {
             if (strs[j].length() <= i ||                              strs[j].charAt(i) != ch) return LCP;
             j++;
           }
          LCP += ch;
          len++;
          i++;
      }
      return LCP;
    }
}