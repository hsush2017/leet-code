package LinkedListCycleII;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> traversed = new HashSet<>();
        while (head != null) {
            if (traversed.contains(head)) {
                return head;
            }

            traversed.add(head);
            head = head.next;
        }

        return null;
    }
}
