class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        //Using sorting
        char ar1[] = s.toCharArray();
        char ar2[] = t.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        int steps = 0, i = 0, j = 0;
        while(i < n  && j < n) {
            if (ar1[i] == ar2[j]){
                i++;
                j++;
            } else if(ar1[i] > ar2[j])j++;
            else {
                steps++;
                i++;
            }
        }
        steps += n-i;
        return steps;        
    }
}
        /*
        // Using  HashMap
        HashMap<Character, Integer> mp1 = new  HashMap<>();
        
        mapped(s, n, mp1);
        HashMap<Character, Integer> mp2 = new  HashMap<>();
        mapped(t, n, mp2);
    
        int steps  = 0;
        Iterator itr = mp1.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry element = (Map.Entry)itr.next();
            char ch = (char)element.getKey();
            int val1 = (int)element.getValue();
            if  (mp2.containsKey(ch)) {
                int val2 = mp2.get(ch);
                if (val1 >  val2) steps +=  val1 - val2;
            } else  steps += val1;
        }
        
        return steps;
    }
    void mapped(String s, int n, HashMap<Character, Integer> mp) {
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i++);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
    }
}
*/