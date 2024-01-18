class Solution {
    public int firstUniqChar(String s) {
      int n = s.length();
      if (n == 1) return 0;
      
     
      
      int arr[] = new int[26];
      
      int i = 0;
      while(i < n) {
        arr[s.charAt(i++)-'a']++;
      }
      
      // Finding the first non-repeating character
      i = 0;
      while(i < n) {
        if (arr[s.charAt(i)-'a'] == 1) return i;
        i++;
      }
      
      return -1;
    }
}