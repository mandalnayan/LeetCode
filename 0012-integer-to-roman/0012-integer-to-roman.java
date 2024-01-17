class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        // Chek is number is greate than or equal to 1000
        int c = num/1000;
        num %= 1000;
        while(c-- > 0) roman.append('M');

        // For 900
        if (num >= 900){
            roman.append("CM");
             num %= 900;
        }
        else {
        // Chek is number is greate than or equal to 500
        if(num >= 500){
             roman.append("D");
            num %= 500;
        }
        //For 400
        if (num >= 400){
             roman.append("CD");
             num %= 400;
        }
        else {
       // Chek is number is greate than or equal to 100
        c = num/100;
        num %= 100;
        while(c-- > 0) roman.append("C");;
        }
    }
    
    // for 90
    if (num >= 90) {
        num %= 90;
       roman.append("XC");
    } else {
        if (num >= 50) {
          num %= 50;
          roman.append("L");;
        }
    }
        // For 40
        if (num >= 40) {
            num %= 40;
           roman.append("XL");
        } else {
        c = num/10;
        num %= 10;
        while(c-- > 0) roman.append("X");;
        }
        // For 9
        if (num == 9) {
            num %= 9;
            roman.append("IX");
        } else {
            if (num >= 5) {
                roman.append("V");;
                num %= 5;
            }
            // 4
            if (num == 4) roman.append("IV");
            else
              while (num--> 0) roman.append("I");;
        }
        return roman.toString();
    }
}