class Solution {
    public int maxArea(int[] height) {
                int left = 0;
        int right = height.length - 1;
        int mostAreaValue = 0;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            area = Math.min(height[left], height[right]) * (right - left);
            mostAreaValue = Math.max(area, mostAreaValue);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] >= height[right]) {
                right--;
            }
        }
        return mostAreaValue;
    }
}
