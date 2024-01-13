class Solution {
    public int minOperations(String s) {
        int n = s.length();
    //  Base case
        if (n == 1) return 0;
        
    // Converting string to  array
        int opr1 = convert(s.toCharArray(), n, 0);
        
        char ch[] = s.toCharArray(); 
        ch[0] = ch[0] == '0' ? '1' : '0';
        int opr2 = convert(ch, n, 1);   
        
        return Math.min(opr1, opr2);      
     }
    
    int convert(char ch[], int n, int opr){
        int i = 1;
        while(i < n) {
            if (ch[i-1] == ch[i]) {
                char c = ch[i];
                ch[i] = c =='1'? '0' : '1';
                opr++;
            }
            i++;
        }
        return opr; 
    }
}