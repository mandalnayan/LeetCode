class Solution {
    public String reversePrefix(String word, char ch) {
       int n = word.length();
       
       if (n == 1) return word;
       
       int i = 0;
       while (i < n) {
        if (word.charAt(i) == ch) break;
        i++;
       }

       if ( i == n) return word;
       
       int k = i;
       // Reversing the string
       StringBuilder resWord = new StringBuilder();
       while (i >= 0) resWord.append(word.charAt(i--));

       resWord.append(word.substring(k+1));
       return resWord.toString();

    }
}