package easy.ConvertBinaryNumberInALinkedListToInteger;

import common.ListNode;

public class Solution {
    public int getDecimalValue(ListNode head) {
        int answer = 0;

        for (int i = getSize(head) - 1; i >= 0; i--) {
            if (head.val == 1) {
                answer += 1 << i;
            }

            head = head.next;
        }

        return answer;
    }

    private int getSize(ListNode head) {
        int size = 1;
        ListNode current = head;

        while (current.next != null) {
            size++;
            current = current.next;
        }

        return size;
    }
}
