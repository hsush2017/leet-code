package AddTwoNumbersII;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Len = length(l1);
        int l2Len = length(l2);

        if (l2Len - l1Len > 0) {
            l1 = appendLeadingZero(Math.abs(l2Len - l1Len), l1);
        } else if (l2Len - l1Len < 0) {
            l2 = appendLeadingZero(Math.abs(l2Len - l1Len), l2);
        }

        ListNode head = addition(l1, l2);
        do {
            ListNode p = head;
            while (p != null) {
                if (p.next != null && p.next.val >= 10) {
                    p.val += p.next.val / 10;
                    p.next.val = p.next.val % 10;
                }

                p = p.next;
            }

        } while (!isFinish(head));

        return head.val == 0 ? head.next : head;
    }

    private boolean isFinish(ListNode head) {
        ListNode p = head;
        while (p != null) {
            if (p.val >= 10) {
                return false;
            } else {
                p = p.next;
            }
        }
        return true;
    }

    private ListNode addition(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null) {
            p.next = new ListNode(l1.val + l2.val);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return head;
    }

    public ListNode appendLeadingZero(int cnt, ListNode next) {
        ListNode node = null;
        while (cnt > 0) {
            node = new ListNode(0, node);

            cnt--;
        }

        if (next != null) {
            ListNode tmp = node;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = next;
        }

        return node;
    }

    public int length(ListNode node) {
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}
