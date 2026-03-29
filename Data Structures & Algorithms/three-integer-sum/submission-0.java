class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        for (int s = 0; s < nums.length - 2; s++) {
            if (s > 0 && nums[s] == nums[s - 1]) continue;
            int i = nums[s];
            int num2 = s + 1;
            int num3 = nums.length - 1;
            num2 = s + 1;
            num3 = nums.length - 1;
            while (num2 < num3) {

                int j = nums[num2];
                int k = nums[num3];

                int sum = i + j + k;

                if (sum < 0) {
                    num2++;
                } else if (sum > 0) {
                    num3--;
                } else {
                    lists.add(Arrays.asList(i, j, k));

                    num2++;
                    num3--;
                    while (num2 < num3 && nums[num2] == nums[num2 - 1]) num2++;
                    while (num2 < num3 && nums[num3] == nums[num3 + 1]) num3--;
                }
            }
        }


        return lists;
    }
}
