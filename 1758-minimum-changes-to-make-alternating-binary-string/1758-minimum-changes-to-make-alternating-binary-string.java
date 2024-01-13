class Solution {
    public int minOperations(String s) {
        int n = s.length();
    //  Base case
        if (n == 1) return 0;
        
    // Converting string to  array
        int opr1 = convert(s, n, '1', '0');
        int opr2 = convert(s, n, '0', '1');   
        
        return Math.min(opr1, opr2);      
     }
    
    int convert(String s, int n, char odd, char even){
        int i = 0, opr = 0;
        while(i < n) {
            char  ch  =  s.charAt(i);
            if (i %2 == 0  && ch != even)  opr++;
            else if(i % 2 == 1 && ch != odd) opr++;  
            i++;
        }
        return opr; 
    }
}