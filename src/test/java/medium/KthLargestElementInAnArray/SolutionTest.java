package medium.KthLargestElementInAnArray;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution sut;

    @Before
    public void setUp() throws Exception {
        sut = new Solution();
    }

    @Test
    public void test1() {
        int answer = sut.findKthLargest(new int[]{1, 4, 2, 5, 3, 6}, 2);

        assertThat(answer).isEqualTo(5);
    }
}