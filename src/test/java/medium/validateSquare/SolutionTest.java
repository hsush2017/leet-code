package medium.validateSquare;

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
        assertThat(sut.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1})).isTrue();
    }

    @Test
    public void test2() {
        assertThat(sut.validSquare(new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0})).isFalse();
    }
}