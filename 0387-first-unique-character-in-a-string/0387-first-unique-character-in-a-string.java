class Solution {
    public int firstUniqChar(String s) {
      int n = s.length();
      if (n == 1) return 0;
      // indexOf(char) return first index of alphabet && lastIndexOf(char) return last index of character, else return -1 if character not present
      int i = 0;
      while(i < n) {
          char ch = s.charAt(i);
          if (s.indexOf(ch) == s.lastIndexOf(ch)) return i;
          i++;
      }
      return -1;
    }
}