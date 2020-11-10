package medium.MaximumDifferenceBetweenNodeAndAncestor;

import common.TreeNode;

public class Solution {
    public int maxAncestorDiff(TreeNode root) {
        TreeNode maxDiffTree = createMaxDiffTree(root);

        return maxValue(maxDiffTree, 0);
    }

    private int maxValue(TreeNode root, int max) {
        if (root == null) {
            return max;
        }
        max = Math.max(max, root.val);
        return Math.max(maxValue(root.left, max), maxValue(root.right, max));
    }

    private TreeNode createMaxDiffTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        return new TreeNode(maxDiff(root, root.val, 0), createMaxDiffTree(root.left), createMaxDiffTree(root.right));
    }


    private int maxDiff(TreeNode node, int rootVal, int max) {
        if (node == null) {
            return max;
        }

        max = Math.max(max, Math.abs(rootVal - node.val));

        return Math.max(maxDiff(node.left, rootVal, max), maxDiff(node.right, rootVal, max));
    }
}
