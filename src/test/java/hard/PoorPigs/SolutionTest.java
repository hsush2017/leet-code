package hard.PoorPigs;

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
        assertThat(sut.poorPigs(1000, 15, 60)).isEqualTo(5);
    }

    @Test
    public void test2() {
        assertThat(sut.poorPigs(4, 15, 15)).isEqualTo(2);
    }
}