package easy.RangeSumOfBST;

import common.TreeNode;
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
        TreeNode root =
                new TreeNode(10,
                        new TreeNode(5,
                                new TreeNode(3),
                                new TreeNode(7)
                        ),
                        new TreeNode(15,
                                null,
                                new TreeNode(18))
                );
        assertThat(sut.rangeSumBST(root, 7, 15)).isEqualTo(32);
    }

    @Test
    public void test2() {
        TreeNode root =
                new TreeNode(10,
                        new TreeNode(5,
                                new TreeNode(3,
                                        new TreeNode(1),
                                        null),
                                new TreeNode(7,
                                        new TreeNode(6),
                                        null)),
                        new TreeNode(15,
                                new TreeNode(13),
                                new TreeNode(18)
                        )
                );
        assertThat(sut.rangeSumBST(root, 6, 10)).isEqualTo(23);
    }
}