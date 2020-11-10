package MaximumDifferenceBetweenNodeAndAncestor;

import common.TreeNode;
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
        TreeNode root =
                new TreeNode(8,
                        new TreeNode(3,
                                new TreeNode(1),
                                new TreeNode(6,
                                        new TreeNode(4),
                                        new TreeNode(7)
                                )
                        ),
                        new TreeNode(10,
                                null,
                                new TreeNode(14,
                                        null,
                                        new TreeNode(13))
                        )
                );
        Assertions.assertThat(sut.maxAncestorDiff(root)).isEqualTo(7);
    }

    @Test
    public void test2() {
        TreeNode root =
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                null,
                                new TreeNode(0,
                                        new TreeNode(3),
                                        null
                                )
                        )
                );
        Assertions.assertThat(sut.maxAncestorDiff(root)).isEqualTo(3);
    }
}