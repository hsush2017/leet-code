package easy.UniqueMorseCodeWords;

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
        assertThat(sut.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})).isEqualTo(2);
    }
}