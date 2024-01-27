class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        if (n == 1)
            return points;

        // We store distance and it's index
        List<List<Integer>> ls = new ArrayList<>();
        int i = 0;
        while (i < n) {
            List<Integer> subLs = new ArrayList<>();
            subLs.add(i);
            int dis = (int)(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            subLs.add(dis);
            ls.add(subLs);
            i++;
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((l1, l2) -> (l1.get(1) - l2.get(1)));
        for (List<Integer> subLs : ls) {
            pq.add(subLs);
        }
        int ans[][] = new int[k][2];
        i = 0;
        while (k > i) {
            List<Integer> subLs = pq.poll();
            int idx = subLs.get(0);
            ans[i][0] = points[idx][0];
            ans[i++][1] = points[idx][1];

        }
        return ans;
    }
}