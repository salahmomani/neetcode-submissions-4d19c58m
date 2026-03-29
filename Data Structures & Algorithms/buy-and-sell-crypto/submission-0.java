class Solution {
    public int maxProfit(int[] prices) {
     
        int payTime = 0;
        int sellTime = 0;
        int max = 0;
        Queue<Integer> queue = new LinkedList<>() {
        };
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                payTime = prices[i];
                sellTime = prices[j];
                queue.add(sellTime - payTime);
            }

        }
        max = queue.stream().max(Integer::compareTo).orElse(0);
        return max;
    }
}