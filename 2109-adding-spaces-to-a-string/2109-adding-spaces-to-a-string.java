class Solution {
    public String addSpaces(String s, int[] spaces) {
        int sn = s.length();
        int n = spaces.length;
        
        StringBuilder sb = new StringBuilder();
        int prevIndx = 0;
        for (int i = 0; i < n; i++) {
            int gap = spaces[i];
            sb.append(s.substring(prevIndx, gap));
            sb.append(" ");
            prevIndx = gap;
        }
        sb.append(s.substring(prevIndx));
    return sb.toString();
    }
    
}