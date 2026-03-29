class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                double index = 0;
        int[] result = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];
        }
        for (int j = nums1.length; j < nums1.length + nums2.length; j++) {
            result[j] = nums2[j - nums1.length];
        }
        Arrays.sort(result);
        if (result.length % 2 != 0) {
            index = (double) result[result.length / 2];

        } else if (result.length % 2 == 0) {
            int x = result.length / 2 - 1;
            int y = result.length / 2;
            index = (double) (result[x] + result[y]) / 2;
        }
        return index;
    }
}
