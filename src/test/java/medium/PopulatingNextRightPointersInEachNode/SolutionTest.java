package medium.PopulatingNextRightPointersInEachNode;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() {
        sut = new Solution();
    }

    @Test
    public void test1() {
        Node node =
                new Node(1,
                        new Node(2,
                                new Node(4),
                                new Node(5),
                                null
                        ),
                        new Node(3,
                                new Node(6),
                                new Node(7),
                                null
                        ),
                        null
                );

        Node answer = sut.connect(node);

        assertThat(answer.val).isEqualTo(1);
        assertThat(answer.next).isNull();
        assertThat(answer.left.val).isEqualTo(2);
        assertThat(answer.right.val).isEqualTo(3);
        assertThat(answer.left.next.val).isEqualTo(3);
    }
}