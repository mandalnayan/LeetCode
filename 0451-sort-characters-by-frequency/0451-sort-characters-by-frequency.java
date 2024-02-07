class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((c1, c2) -> map.get(c2) - map.get(c1));

        for (char ch : map.keySet()) {
            pq.add(ch);
        }

        String res = "";
        while (!pq.isEmpty()) {
            char ch = pq.remove();
            int f = map.get(ch);
            while (f-- > 0)
                res += ch;
        }

        return res;
    }
}