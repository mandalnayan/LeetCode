class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        
        // Base case
        if (n == 1) return s;
        
        String rs = "", cw = "";
        
        int i = n-1;
        while (i >= 0) {
            char ch  = s.charAt(i);
            if (ch == ' '){
                if (i < n-1 && s.charAt(i+1) != ' ') 
                    rs = rs + cw + " ";
                    cw = "";
            } else {
                cw = ch + cw;
            }
            i--;
        }
        rs += cw;
        if (rs.charAt(rs.length()-1) == ' ') {
            rs = rs.substring(0, rs.length()-1);
        }
        return rs;
    }
}