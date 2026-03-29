class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minimumValue = nums[0];
    if (nums.length == 1) {
           return nums[0];
        }

        while (left <= right) {

     if (nums[left] < nums[right]) {
            minimumValue = Math.min(minimumValue, nums[left]);
                break;            }
            int mid = left + (right - left) / 2;
            minimumValue = Math.min(minimumValue, nums[mid]);

        if (nums[mid] >= nums[left]) {
            left = mid + 1;
                        } else {
                right = mid - 1;
            }
        }
        return minimumValue;
    }
}
