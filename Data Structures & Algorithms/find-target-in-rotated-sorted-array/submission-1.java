class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        for(;right>=left;left++,right--){
            if(nums[right]==target){
                return right;
            }
            if(nums[left]==target){
                return left;
            }
        }
    return -1;
    }
}
