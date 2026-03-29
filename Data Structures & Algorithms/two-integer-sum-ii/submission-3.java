class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] temp = Arrays.copyOf(nums, nums.length);

        Integer[] sortedArray = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(sortedArray); 

        int left = 0;
        int right = sortedArray.length - 1;

        while (left < right) {
            int sum = sortedArray[left] + sortedArray[right];

            if (sum == target) break;
            else if (sum < target) left++;
            else right--;
        }

        int number1 = -1, number2 = -1;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == sortedArray[left] && number1 == -1) {
                number1 = i;
            } else if (temp[i] == sortedArray[right] && number2 == -1) {
                number2 = i;
            }
        }

        int[] result = {number1+1, number2+1};
        Arrays.sort(result); 

        return result;
    }


}
