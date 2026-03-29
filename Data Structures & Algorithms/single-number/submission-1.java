class Solution {
    public int singleNumber(int[] nums) {
               if (nums.length == 1) {
                 if (nums[0] < 0) {
                return -1;
            }
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
