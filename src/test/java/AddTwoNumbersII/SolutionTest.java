package AddTwoNumbersII;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode answer = sut.addTwoNumbers(l1, l2);

        Assertions.assertThat(answer.val).isEqualTo(7);
        Assertions.assertThat(answer.next.val).isEqualTo(8);
        Assertions.assertThat(answer.next.next.val).isEqualTo(0);
        Assertions.assertThat(answer.next.next.next.val).isEqualTo(7);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode answer = sut.addTwoNumbers(l1, l2);

        Assertions.assertThat(answer.val).isEqualTo(1);
        Assertions.assertThat(answer.next.val).isEqualTo(0);
        Assertions.assertThat(answer.next.next.val).isEqualTo(0);
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(9, new ListNode(1, new ListNode(6)));
        ListNode l2 = new ListNode(0);
        ListNode answer = sut.addTwoNumbers(l1, l2);

        Assertions.assertThat(answer.val).isEqualTo(9);
        Assertions.assertThat(answer.next.val).isEqualTo(1);
        Assertions.assertThat(answer.next.next.val).isEqualTo(6);
    }
}