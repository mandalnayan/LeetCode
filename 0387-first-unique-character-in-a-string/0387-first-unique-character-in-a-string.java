class Solution {
    public int firstUniqChar(String s) {
      int n = s.length();
      
      if (n == 1) return 0;
      int ans = Integer.MAX_VALUE;
      for (char ch = 'a' ; ch <= 'z'; ch++) {
          // Return the index of first occurance of this character, if not present return -1
          int index = s.indexOf(ch);     
          // lastIndexOf return the last occurace, if both are same, means it is unique
          if (index != -1 && index == s.lastIndexOf(ch)) ans = Math.min(ans, index);  
      }
      return ans == Integer.MAX_VALUE ? -1 : ans;

    }
}