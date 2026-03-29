class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> map = new HashMap<>();
        int value = 1;
        int[] arr = new int[k];
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, value);
            } else {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}
