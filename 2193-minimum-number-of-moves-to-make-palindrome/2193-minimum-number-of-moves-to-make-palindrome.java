class Solution {
    public int minMovesToMakePalindrome(String s) {
      int n = s.length();
      
      // Converting string into char_array
      char arr[] = s.toCharArray();
      if (n == 1) return 0;
      
      int moves = 0, l = 0, r = n-1;
      while (l < r) {
        char ch = arr[r];
        int j = l;
        while (j < r && arr[j] != ch) j++;
        //If the characer occured one time than that          must be place at the middle of the string
       if (j == r) {
         ch = arr[j];
         arr[j] = arr[j-1];
         arr[j-1] = ch;
         moves += 1;
       }
        else{
           while (j != l) {
             arr[j] = arr[j-1];
             j--;
             moves++;
           }
          arr[j] = ch;
          l++;
          r--;
        }
        
      }

return moves;
    }
}