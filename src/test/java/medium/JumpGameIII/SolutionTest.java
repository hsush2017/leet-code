package medium.JumpGameIII;

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
        assertThat(sut.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5)).isTrue();
    }

    @Test
    public void test2() {
        assertThat(sut.canReach(new int[]{4,2,3,0,3,1,2}, 0)).isTrue();
    }

    @Test
    public void test3() {
        assertThat(sut.canReach(new int[]{3,0,2,1,2}, 2)).isFalse();
    }
}