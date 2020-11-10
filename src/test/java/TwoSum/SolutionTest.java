package TwoSum;

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
        Assertions.assertThat(sut.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.twoSum(new int[]{0, 4, 3, 0}, 0)).isEqualTo(new int[]{0, 3});
    }
}