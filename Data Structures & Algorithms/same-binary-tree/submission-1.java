/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(p);
        stack2.push(q);

        while (!stack1.isEmpty() && !stack2.isEmpty()) {

            TreeNode head1 = stack1.pop();
            TreeNode head2 = stack2.pop();

            if (head1 == null && head2 == null) continue;

            if (head1 == null || head2 == null) return false;

            if (head1.val != head2.val) return false;

            stack1.push(head1.right);
            stack2.push(head2.right);

            stack1.push(head1.left);
            stack2.push(head2.left);
        }

        return stack1.isEmpty() && stack2.isEmpty();
    }
}
