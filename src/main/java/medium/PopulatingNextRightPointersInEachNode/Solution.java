package medium.PopulatingNextRightPointersInEachNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        int cnt = 0;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            cnt++;

            int depth = getDepth(cnt);
            int levelLastIndex = (int) (Math.pow(2, depth) - 1);

            node.next = cnt == levelLastIndex ? null : queue.peek();

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }

    private int getDepth(int cnt) {
        int answer = 0;
        while (cnt / 2 > 0) {
            answer++;
            cnt /= 2;
        }
        return answer + 1;
    }
}
