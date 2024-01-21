class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        // Base case
        if (n <= 1)return 0;

        Stack<Character>char_st = new Stack<>();
        Stack<Integer>index_st = new Stack<>();
        index_st.push(-1);
        int i = 0, len = 0;
        while (i < n){
           char ch = s.charAt(i);
           if(ch ==  '(') {
            index_st.push(i);
            char_st.push(ch);
           }else {
               if(char_st.isEmpty()) {
                   index_st.push(i);
               } else{
                    index_st.pop();
                    char_st.pop();
                    int cur_len = i - index_st.peek();
                    len = Math.max(len, cur_len);
               }
           }
           i++;
        }
        return len;
    }
}
/*
        int i = 0, l = -1, len = 0;
        while(i < n) {
            char ch = s.charAt(i);
            if(ch == '(') st.push(ch);
            else {
                if(st.size()==1){
                    st.pop();
                    int cur_len =  i-l;
                    len = Math.max(len, cur_len);
                    l = i;
            } else if(!st.isEmpty()) st.pop();
            else {
                l = i;
            }
        }
        i++;
    }
    if(!st.isEmpty()) {
      int cur_len =  i-l-st.size()-1;
      len = Math.max(cur_len, len);
    }
    return len;
    }
}
*/