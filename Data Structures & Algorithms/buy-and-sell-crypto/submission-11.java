class Solution {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int result = 0;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (right == prices.length) { break; }

            if ((prices[right] - prices[left]) < 0) {
                result = prices[right] - prices[left];
                left = right;   
                right++;
            } 
            else if ((prices[right] - prices[left]) <= result) {
                result = prices[right] - prices[left];
                right++;
            } 
            else if ((prices[right] - prices[left]) >= result) {
                result = prices[right] - prices[left];
                right++;
            }

            max = Math.max(max, result);
        }
        return max;
    }
}
