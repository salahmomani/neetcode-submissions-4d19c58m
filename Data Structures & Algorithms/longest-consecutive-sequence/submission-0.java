class Solution {
    public int longestConsecutive(int[] nums) {
             if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int temp = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                temp++;
            } else if (nums[i + 1] != nums[i]) {
                temp = 0;
            }
            result = Math.max(result, temp);
        }

        return result + 1;
    }
}
