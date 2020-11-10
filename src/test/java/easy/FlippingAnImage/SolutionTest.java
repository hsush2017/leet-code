package easy.FlippingAnImage;

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
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] expect = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        assertThat(sut.flipAndInvertImage(image)).isEqualTo(expect);
    }

    @Test
    public void test2() {
        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] expect = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};

        assertThat(sut.flipAndInvertImage(image)).isEqualTo(expect);
    }
}