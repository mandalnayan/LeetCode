class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer> resultList = new ArrayList<>();

           for(int s = 1; s <= 9; s++) {
              int num = s;
               int e = s+1, flag = 0;
               while(e <= 9) {
                   num = num * 10 + e;
                   if (low <= num && num <= high) {
                       resultList.add(num);
                       flag = 1;
                   } else if(num > high) break;
                   e++;
               }
           }
           Collections.sort(resultList);
       
       return resultList;
    }
}