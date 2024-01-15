class Solution {
public String smallestSubsequence(String s) {
        int n = s.length();

        if (n == 1) return s;

        boolean visited[] = new boolean[26];
        int lastSeen[] = new int[26];

        int i = 0;
        while (i < n) {
            lastSeen[s.charAt(i)-'a'] = i;
            i++;       
        }

        StringBuilder rs = new StringBuilder();
        i = 0;
        while(i < n) {
            char ch = s.charAt(i);
            int idx = ch-'a';
            if (visited[idx]){
              i++;
              continue;
            }

            int rn = rs.length();
            if (rn == 0 || rs.charAt(rn-1) < ch) {
                rs = rs.append(ch);
                visited[idx] = true;
            } else {
                char lc = rs.charAt(rn-1);
                while (rn > 0 && lc > ch) {
                    if (lastSeen[lc-'a'] < i) break;
                    visited[lc-'a'] = false;
                    rs = rs.deleteCharAt(rn-1);
                    rn = rs.length();
                    // System.out.println(rn);
                    if (rn > 0) lc = rs.charAt(rn-1);
                }
                rs =rs.append(ch);
                visited[idx] = true;
            }
            i++;
        }
        return rs.toString();

    }
}