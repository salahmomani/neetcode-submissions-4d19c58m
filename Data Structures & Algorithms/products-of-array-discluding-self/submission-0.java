class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int post[] = new int[nums.length];
        int p1 = 1, p2 = 1;
        for (int i = 0; i < nums.length; i++) {
            pre[i] =  p1;
            p1 = p1 * nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                post[i] = 1;
            }
            post[i] = p2;
            p2 = p2 * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = post[i] * pre[i];
        }
        return result;
    }

}  
