class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res_list =  new ArrayList<>();
        int n = s.length(), m = p.length();
        
        // Base case, No anagram 
        if (m > n) return res_list;
        
        HashMap<Character,  Integer> smap = new HashMap<>(),   pmap  = new HashMap<>();

       // Storing frequency of P string
       int i = 0, j = 0;
       while(i < m){
           char ch = p.charAt(i++);
           pmap.put(ch, pmap.getOrDefault(ch, 0)+1);        
         }    
       // Storing frequency of P string
       i = 0;
       while(i < m){
           char ch = s.charAt(i++);
           smap.put(ch, smap.getOrDefault(ch, 0)+1);        
         }
         while(i < n) {
             if(smap.equals(pmap)) res_list.add(j);
             char include = s.charAt(i);
             smap.put(include, smap.getOrDefault(include,0)+1);
             char exclude = s.charAt(j);
             smap.put(exclude, smap.get(exclude)-1);
            if(smap.get(exclude) == 0){
                 smap.remove(exclude);
               }
             i++;
             j++;
         }
        if(smap.equals(pmap)) res_list.add(j);
        return res_list;        
    }
}