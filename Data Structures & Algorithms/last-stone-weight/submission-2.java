class Solution {   
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        for (int s : stones) {
            queue.add(s);
        }
        while (queue.size() > 1) {
            int number1 = queue.poll();
            int number2 = queue.poll();
            if (number1 != number2) {
                queue.add(number1 - number2);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
