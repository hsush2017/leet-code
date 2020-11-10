package medium.FindTheSmallestDivisorGivenAThreshold;

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
        int answer = sut.smallestDivisor(new int[]{1, 2, 5, 9}, 6);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    public void test2() {
        int answer = sut.smallestDivisor(new int[]{2, 3, 5, 7, 11}, 11);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    public void test3() {
        int answer = sut.smallestDivisor(new int[]{19}, 5);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    public void test4() {
        int answer = sut.smallestDivisor(new int[]{12, 50, 11, 75, 57, 12, 73, 4, 69, 78}, 649);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    public void test5() {
        int answer = sut.smallestDivisor(new int[]{2, 2, 2, 2}, 4);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}