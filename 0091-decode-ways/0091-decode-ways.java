class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp, -1);
        return rec(s, 0, dp);
    }
    public int rec(String s, int idx, int cach[]) {
        if (cach[idx] != -1) return cach[idx];
        if (idx == s.length()) return 1;
        int ans = 0, i = 1;
        while (i <= 2 && idx <= s.length()-i) {
            if (s.charAt(idx) == '0' || Integer.parseInt(s.substring(idx,idx+i)) > 26  ) break;
            ans += rec(s, idx+i, cach);
            i++;
        }
        cach[idx] = ans;
        return ans;  
    }
}