package ConsecutiveCharacters;

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
        Assertions.assertThat(sut.maxPower("leetcode")).isEqualTo(2);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.maxPower("abbcccddddeeeeedcba")).isEqualTo(5);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.maxPower("triplepillooooow")).isEqualTo(5);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.maxPower("hooraaaaaaaaaaay")).isEqualTo(11);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.maxPower("tourist")).isEqualTo(1);
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.maxPower("j")).isEqualTo(1);
    }

    @Test
    public void test7() {
        Assertions.assertThat(sut.maxPower("cc")).isEqualTo(2);
    }
}