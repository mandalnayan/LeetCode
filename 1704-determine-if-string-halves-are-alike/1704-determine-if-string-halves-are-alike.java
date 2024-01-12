class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        
        s = s.toUpperCase();             
        return (countVowel(s, 0, n/2) == countVowel(s, n/2, n));
    }
    int countVowel(String str, int s, int e) {        
       char vow[] = {'A', 'E', 'I', 'O', 'U'};
       int v = 0;
        for (int i = s; i < e; i++) {
            char ch = str.charAt(i);
            int j = 0;
            while (j < 5) {
                if (vow[j] == ch) {
                    v++;
                    break;
                }
                j++;
            }
        }
        return v;
    }
}