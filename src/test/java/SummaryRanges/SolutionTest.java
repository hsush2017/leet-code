package SummaryRanges;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        List<String> result = new Solution().summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        Assertions.assertThat(result).containsExactly("0->2", "4->5", "7");
    }

    @Test
    public void test2() {
        List<String> result = new Solution().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});

        Assertions.assertThat(result).containsExactly("0", "2->4", "6", "8->9");
    }

    @Test
    public void test3() {
        List<String> result = new Solution().summaryRanges(new int[]{});

        Assertions.assertThat(result).isEmpty();
    }

    @Test
    public void test4() {
        List<String> result = new Solution().summaryRanges(new int[]{-1});

        Assertions.assertThat(result).containsExactly("-1");
    }

    @Test
    public void test5() {
        List<String> result = new Solution().summaryRanges(new int[]{0});

        Assertions.assertThat(result).containsExactly("0");
    }
}