package medium.LongestMountainInArray;

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
        assertThat(sut.longestMountain(new int[]{2, 1, 4, 7, 3, 2, 5})).isEqualTo(5);
    }

    @Test
    public void test2() {
        assertThat(sut.longestMountain(new int[]{2, 0, 2, 2, 3})).isEqualTo(0);
    }

    @Test
    public void test3() {
        assertThat(sut.longestMountain(new int[]{1, 1, 0, 0, 1, 0})).isEqualTo(3);
    }

    @Test
    public void test4() {
        assertThat(sut.longestMountain(new int[]{875, 884, 239, 731, 723, 685})).isEqualTo(4);
    }

    @Test
    public void test5() {
        assertThat(sut.longestMountain(new int[]{0, 0, 1, 0, 0, 1, 1, 1, 1, 1})).isEqualTo(3);
    }
}