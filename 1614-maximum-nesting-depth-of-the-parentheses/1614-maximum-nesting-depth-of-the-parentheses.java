class Solution {
    public int maxDepth(String s) {
       int maxDepth = 0, curDepth = 0;
     //  Stack<Character> st = new Stack();

       for (char ch : s.toCharArray()) {
            if (ch == '(') {
         //       st.push('(');
                curDepth++;
                maxDepth = Math.max(maxDepth, curDepth);
            } else if (ch == ')') {
          //      st.pop();
                curDepth--;
            }
       }
       return maxDepth; 
    }
}