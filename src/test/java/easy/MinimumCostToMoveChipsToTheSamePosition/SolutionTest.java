package easy.MinimumCostToMoveChipsToTheSamePosition;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        int answer = new Solution().minCostToMoveChips(new int[]{1, 2, 3});
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    public void test2() {
        int answer = new Solution().minCostToMoveChips(new int[]{2, 2, 2, 3, 3});
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    public void test3() {
        int answer = new Solution().minCostToMoveChips(new int[]{1, 1000000000});
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    public void test4() {
        int answer = new Solution().minCostToMoveChips(new int[]{3, 3, 1, 2, 2});
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    public void test5() {
        int answer = new Solution().minCostToMoveChips(new int[]{6, 4, 7, 8, 2, 10, 2, 7, 9, 7});
        Assertions.assertThat(answer).isEqualTo(4);
    }
}