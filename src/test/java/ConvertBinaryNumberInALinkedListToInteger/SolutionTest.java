package ConvertBinaryNumberInALinkedListToInteger;

import common.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        ListNode head = createLinkedList(new int[]{1, 0, 1});

        Assertions.assertThat(new Solution().getDecimalValue(head)).isEqualTo(5);
    }

    @Test
    public void test2() {
        ListNode head = createLinkedList(new int[]{0});

        Assertions.assertThat(new Solution().getDecimalValue(head)).isEqualTo(0);
    }

    @Test
    public void test3() {
        ListNode head = createLinkedList(new int[]{1});

        Assertions.assertThat(new Solution().getDecimalValue(head)).isEqualTo(1);
    }

    @Test
    public void test4() {
        ListNode head = createLinkedList(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0});

        Assertions.assertThat(new Solution().getDecimalValue(head)).isEqualTo(18880);
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