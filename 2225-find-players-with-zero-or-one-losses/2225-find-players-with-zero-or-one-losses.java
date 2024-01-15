class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res_list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = matches.length;

        // Base case
        if (n == 1) {
            list1.add(matches[0][0]);
            list2.add(matches[0][1]);
            res_list.add(list1);
            res_list.add(list2);
            return res_list;
        }
        int loseCount[] = new int[100001];

        int i = 0;
        while(i < n) {
            int wp = matches[i][0];
            int lp = matches[i][1];

            if (loseCount[wp] == 0) {
                loseCount[wp] = -1;
            }
            if (loseCount[lp] == -1) {
                loseCount[lp] = 1;
            } else {
                loseCount[lp]++;
            }
            i++;
        }

        //We store the result
        i = 1;
        while(i < 100001) {
            int value = loseCount[i];
            if (value == -1) list1.add(i);
            else if(value == 1)list2.add(i);
            i++;
        }
        res_list.add(list1);
        res_list.add(list2);

        return res_list;
    }
}
/*
//Solution Using HashSet
     // Storing the player who lose exactly one game
        HashSet<Integer> lose = new HashSet<>();
        int i = 0;
        while (i < n) {
            int p = matches[i][1];
             if (lose.contains(p)) {
                 if (list2.contains(p))
                     list2.remove(list2.indexOf(p));
             } else {
                 lose.add(p);
                 list2.add(p);
             }
             i++;
        }
        // Storing the player who never lose any game
        i = 0;
        while (i < n) {
            int p = matches[i][0];
            if (!lose.contains(p) && !list1.contains(p)) {
                list1.add(p);
            }
            i++;
        }
        // Sort the resultant list
        Collections.sort(list1);
        Collections.sort(list2);
        
        res_list.add(list1);
        res_list.add(list2);

        return res_list;
    }
}
*/