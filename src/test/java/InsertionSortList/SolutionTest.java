package InsertionSortList;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        ListNode head = createLinkedList(new int[]{4, 2, 1, 3});
        ListNode answer = new Solution().insertionSortList(head);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.next.val).isEqualTo(2);
        Assertions.assertThat(answer.next.next.val).isEqualTo(3);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(4);
    }

    @Test
    public void test2() {
        ListNode head = createLinkedList(new int[]{-1, 5, 3, 4, 0});
        ListNode answer = new Solution().insertionSortList(head);

        Assertions.assertThat(answer.val).isEqualTo(-1);
        Assertions.assertThat(answer.next.val).isEqualTo(0);
        Assertions.assertThat(answer.next.next.val).isEqualTo(3);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(4);
        Assertions.assertThat(answer.next.next.next.next.val).isEqualTo(5);
    }

    @Test
    public void test3() {
        ListNode head = createLinkedList(new int[]{});
        ListNode answer = new Solution().insertionSortList(head);

        Assertions.assertThat(answer).isNull();
    }

    @Test
    public void test4() {
        ListNode head = createLinkedList(new int[]{5, 1, 8, 5});
        ListNode answer = new Solution().insertionSortList(head);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.next.val).isEqualTo(5);
        Assertions.assertThat(answer.next.next.val).isEqualTo(5);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(8);
    }

    private ListNode createLinkedList(int[] arr) {
        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                head = new ListNode(arr[i]);
                current = head;
            } else {
                ListNode node = new ListNode(arr[i]);
                current.next = node;
                current = node;
            }
        }

        return head;
    }

}