class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        
        // Base case
        if (n == 1) return s;
        
        StringBuilder rs = new StringBuilder();
    //  StringBuilder cw = new StringBuilder();
        String  cw = "";
        
        
        int i = n-1;
        while (i >= 0) {
            char ch  = s.charAt(i);
            if (ch == ' '){
                if (i < n-1 && s.charAt(i+1) != ' ') 
                    cw += " ";
                     rs.append(cw);
                    cw = "";
            } else {
                cw = ch + cw;
            }
            i--;
        }
        rs.append(cw);
        int m = rs.length()-1;
        if (rs.charAt(m) == ' ') {
            rs = rs.delete(m, m+1);
        }
        return rs.toString();
    }
}