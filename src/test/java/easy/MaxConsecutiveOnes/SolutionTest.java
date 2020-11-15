package easy.MaxConsecutiveOnes;

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
        assertThat(sut.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})).isEqualTo(3);
    }

    @Test
    public void test2() {
        assertThat(sut.findMaxConsecutiveOnes(new int[]{0})).isEqualTo(0);
    }
}