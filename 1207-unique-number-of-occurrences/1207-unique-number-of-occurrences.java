class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        
        // Base case
        if (n == 1) return true;
        // Using sorting ans hashSet
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        int i = 1, count = 1;
        while(i < n) {
            if (arr[i-1] != arr[i]) {
                if(set.contains(count)) return false;
                set.add(count);
                count = 0;
            }
            i++;
            count++;
        }

        return (!set.contains(count));
    }
}
