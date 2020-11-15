package easy;

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
        assertThat(sut.sortedSquares(new int[]{-4, -1, 0, 3, 10})).isEqualTo(new int[]{0, 1, 9, 16, 100});
    }

    @Test
    public void test2() {
        assertThat(sut.sortedSquares(new int[]{-7, -3, 2, 3, 11})).isEqualTo(new int[]{4, 9, 9, 49, 121});
    }
}