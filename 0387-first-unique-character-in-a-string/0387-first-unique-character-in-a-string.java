class Solution {
    public int firstUniqChar(String s) {
      int n = s.length();
      
      if (n == 1) return 0;
      int i = 0;
      while(i < n) {
        char ch = s.charAt(i);
        // If character is not repeating then first occurance and last occurance is same
        if (s.indexOf(ch) == s.lastIndexOf(ch)) return i;  
        i++;
      }
      return -1;
    }
}