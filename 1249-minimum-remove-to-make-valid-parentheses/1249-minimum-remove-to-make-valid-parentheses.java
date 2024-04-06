class Solution {
    public String minRemoveToMakeValid(String s) {
       int n = s.length();
       // Base case
       if (n == 0) return s;

       StringBuilder sb = new StringBuilder(s);

       Stack<Integer> st = new Stack<>();
       int i = 0;
       while (i < n) {
        if (sb.charAt(i) == '(') st.push(i);
        else if (sb.charAt(i) == ')') {
            if (st.isEmpty()) {
                sb.deleteCharAt(i);
                n --;
                i--;
            } else
                st.pop();
        }
        i++;
       }
       while (!st.isEmpty()) {
             int idx = st.peek(); st.pop();
             sb.deleteCharAt(idx);
       }
       return sb.toString();
    }
}