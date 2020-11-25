package medium.BasicCalculatorII;

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
        assertThat(sut.calculate("3+2*2")).isEqualTo(7);
    }

    @Test
    public void test2() {
        assertThat(sut.calculate(" 3/2 ")).isEqualTo(1);
    }

    @Test
    public void test3() {
        assertThat(sut.calculate(" 3+5 / 2 ")).isEqualTo(5);
    }

    @Test
    public void test4() {
        assertThat(sut.calculate("3+2-4")).isEqualTo(1);
    }

    @Test
    public void test5() {
        assertThat(sut.calculate("0-2147483647")).isEqualTo(-2147483647);
    }

    @Test
    public void test6() {
        assertThat(sut.calculate("14/3*2")).isEqualTo(8);
    }

    @Test
    public void test7() {
        assertThat(sut.calculate("2*3-4")).isEqualTo(2);
    }

    @Test
    public void test8() {
        assertThat(sut.calculate("1+2*5/3+6/4*2")).isEqualTo(6);
    }
}