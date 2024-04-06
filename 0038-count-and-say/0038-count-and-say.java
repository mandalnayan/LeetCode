class Solution {
    public String countAndSay(int n) {
       //  Base case
       if (n == 1) return "1";

       return rec("11", 2, n);
    }

    public String rec(String st, int count, int n) {
     if (n == count) return st;
     StringBuilder sb = new StringBuilder();
     int i = 1, x = 0;
     while (i < st.length()) {
        if (st.charAt(x) != st.charAt(i)) {
               sb.append((""+ (i - x) + st.charAt(x)));
               x = i;
        }
        i++;
     }
     sb.append((""+ (i - x) + st.charAt(x)));
     return rec(sb.toString(), count+1, n);
    }
}