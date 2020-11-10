package easy.BinaryTreeTilt;

import common.TreeNode;

public class Solution {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.abs(sum(root.left) - sum(root.right)) + findTilt(root.left) + findTilt(root.right);
    }

    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }
}
