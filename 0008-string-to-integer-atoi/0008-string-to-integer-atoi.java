class Solution {
    public int myAtoi(String s) {

        // Step-1 Remove whitespace
        while (0 < s.length()) {
            char ch = s.charAt(0);
            if (ch != ' ') break;
            s = s.substring(1);
        }

        int n = s.length();
        if (n == 0) return 0;

        // step-2 check sign of given string
        int sign = 1;
        int i = 0;
        char ch = s.charAt(0);
        if (ch == '-' || ch == '+'){
            if (ch == '-') sign = 0;
             i = 1;
        }

        int value = 0, limit = Integer.MAX_VALUE;
        while (i < n) {
            int digit = s.charAt(i) - '0';
            
            // checking is current character is non-digit
            if (digit < 0 || digit > 9 ) break;

            //Checking overflow condition
            if (limit/10 < value || limit/10 == value && limit % 10 < digit) 
                return sign == 1 ? limit : (limit * -1 - 1);

            value = (value*10 + digit);
            i++;
        }
        if (sign == 0) value *= -1;
        return value;
    }
}