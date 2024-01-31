class Solution {
    public int[] dailyTemperatures(int[] temp) {
      int n = temp.length;
      int res[] = new int[n];
      if (n <= 1) return res;
      
      Stack<Integer> st = new Stack<>();
      int i = n-2;
      st.push(n-1);
      res[n-1] = 0;
      while(i >=0) {
          while(!st.isEmpty() && temp[i] >= temp[st.peek()]) {
                st.pop();
          }
        if (st.isEmpty()) res[i] = 0;
        else {
          res[i] = st.peek() - i;
        }
        st.push(i--);
      }
      return res;
      
    }
}