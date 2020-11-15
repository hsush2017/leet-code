package easy.RangeSumOfBST;

import common.TreeNode;

public class Solution {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);

        return sum;
    }

    private void dfs(TreeNode root, int low, int high) {
        if (root != null) {
            sum += root.val >= low && root.val <= high ? root.val : 0;
            dfs(root.left, low, high);
            dfs(root.right, low, high);
        }
    }
}
