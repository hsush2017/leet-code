package easy.FindNumbersWithEvenNumberOfDigits;

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
        assertThat(sut.findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2);
    }
}