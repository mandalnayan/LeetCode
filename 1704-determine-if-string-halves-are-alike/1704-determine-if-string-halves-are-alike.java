class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        
        int l = 0, r = n - 1, v1 = 0, v2 = 0;
        while (l < r) {
            char ch1 = s.charAt(l++);
            char ch2 = s.charAt(r--);
            
            if (ch1 == ch2) continue;
            if (vowel.contains(ch1)) v1++;
            if (vowel.contains(ch2)) v2++;
        }
        return (v1 == v2);
      
    }
}