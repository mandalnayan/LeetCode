class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[] = sentence.split(" ");
        int serLen = searchWord.length();
        
        for (int i = 0; i < arr.length; i++) {
            String sub = arr[i];
            int subLen = sub.length();
            if (subLen >= serLen && searchWord.equals(sub.substring(0, serLen))) {
                return (i+1);
            }
        }
        
        return -1;
    }
}