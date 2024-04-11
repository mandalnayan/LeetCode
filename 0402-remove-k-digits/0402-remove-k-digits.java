class Solution {
    public String removeKdigits(String s, int k) {
    int n = s.length();
    // Base case
    if (n == 0 || k == 0) return s;
    if (n == k) return "0";

    StringBuilder num = new StringBuilder(s);
    
    int i = 0;
    while (i < n-1 && k > 0) {
        char fn = num.charAt(i);
        char sn = num.charAt(i+1);

        if (fn <= sn) i++;
        else {
            num.deleteCharAt(i);
            if(i > 0) i--;
            k--;
            n = num.length();
        }
    }
    if (k > 0) num.delete(num.length()-k, num.length());
    while (num.length() > 1 && num.charAt(0) == '0') num.deleteCharAt(0); 

    return num.length() == 0 ? "0" : num.toString();  
    }
}