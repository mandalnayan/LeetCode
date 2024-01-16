class Solution {
    public int lengthOfLastWord(String s) {
      int n = s.length();
      //Remove blank_space from right side
      while(n >= 0) {
        if (s.charAt(n-1)!= ' ') break;
        s = s.substring(0, n-1);
        n = s.length();
      }
      int i = n-1, len = 0;
      while(i >= 0) {
        if(s.charAt(i--) == ' ') break;
        len++;
      }
      
      return len;
    }
}