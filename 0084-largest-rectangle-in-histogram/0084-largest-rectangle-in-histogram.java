class Solution {
    public int largestRectangleArea(int[] heights) {
       int ans = 0, n = heights.length;
       Stack<Integer> st = new Stack<>(); st.push(-1);
       int l[] = new int[n];
       l[0] = -1;
       for (int i = 0; i < n; i++) {
             while(st.peek() != -1 && heights[st.peek()] >= heights[i]) {
                 st.pop();
            }
            l[i] = st.peek();
            st.push(i);
       }

       int r[] = new int[n];
       st.clear(); st.push(n);
       r[n-1] = n;
       for (int i = n-1; i >= 0; i--) {
             while(st.peek() != n && heights[st.peek()] >= heights[i]) {
                 st.pop();
            }
            r[i] = st.peek();
            st.push(i);
       }

       for (int i = 0; i < n; i++) {
        ans = Math.max(heights[i]* (r[i]-l[i]-1),  ans);
       }
       return ans;
    }
}