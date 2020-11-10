package medium.InsertionSortList;

import common.ListNode;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode c = head.next;

        while (c != null) {
            ListNode p = head;
            while (p.next != c.next) {
                if (p.val > c.val) {
                    swap(p, c);
                }
                p = p.next;
            }

            c = c.next;
        }

        return head;
    }

    private void swap(ListNode a, ListNode b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }

    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
