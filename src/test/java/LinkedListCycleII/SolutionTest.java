package LinkedListCycleII;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        ListNode head = prepareListNode(new int[]{3, 2, 0, -4}, 1);

        ListNode answer = new Solution().detectCycle(head);

        Assertions.assertThat(answer.val).isEqualTo(2);
    }

    @Test
    public void test2() {
        ListNode head = prepareListNode(new int[]{1, 2}, 0);

        ListNode answer = new Solution().detectCycle(head);

        Assertions.assertThat(answer.val).isEqualTo(1);
    }

    @Test
    public void test3() {
        ListNode head = prepareListNode(new int[]{1}, -1);

        ListNode answer = new Solution().detectCycle(head);

        Assertions.assertThat(answer).isNull();
    }

    @Test
    public void test4() {
        ListNode head = prepareListNode(new int[]{-1, -7, 7, -4, 19, 6, -9, -5, -2, -5}, 6);

        ListNode answer = new Solution().detectCycle(head);

        Assertions.assertThat(answer.val).isEqualTo(-9);
    }

    @Test
    public void test5() {
        ListNode answer = new Solution().detectCycle(null);

        Assertions.assertThat(answer).isNull();
    }

    private ListNode prepareListNode(int[] values, int pos) {
        ListNode head = new ListNode(values[0]);
        ListNode previous = head;

        for (int i = 1; i < values.length; i++) {
            ListNode current = new ListNode(values[i]);
            previous.next = current;
            previous = current;
        }

        previous.next = findLoopNode(head, pos);

        return head;
    }

    private ListNode findLoopNode(ListNode head, int pos) {
        if (pos < 0) {
            return null;
        }

        if (pos == 0) {
            return head;
        }

        ListNode next = head;
        for (int i = 0; i < pos; i++) {
            next = next.next;
        }

        return next;
    }
}