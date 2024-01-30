class Solution {
    public int evalRPN(String[] tokens) {
      int n = tokens.length;
      Stack<Integer> st = new Stack<>();
      for (String sub : tokens) {
        if (sub.equals("+") || sub.equals("-") || sub.equals("*") || sub.equals("/")) {
          if (st.size() >= 2) {
            int y= st.pop();
            int x = st.pop();
            int res = 0;
            if (sub.equals("+")) res = x + y;
            else if(sub.equals("-")) res = x - y;
            else if(sub.equals("*")) res = x * y;
            else                     res = x / y;
            
            st.push(res);
          }
        } else {
          st.push(Integer.parseInt(sub));
        }
      }
      
      return st.pop();
    }
}