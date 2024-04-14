class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> lists = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         list.add(1);
         lists.add(list);
         int i = 0;
         while (i < numRows-1) {
             List<Integer> prvList = lists.get(i), newList = new ArrayList<>();
             int j = 0;
             while (j <= prvList.size()) {
               if (j == 0 || j == prvList.size()) {
                   newList.add(1);
               } else {
                newList.add(prvList.get(j-1) + prvList.get(j));
               }
               j++;
             }
             lists.add(newList);
             i++;
         }    
         return lists;
    }
}