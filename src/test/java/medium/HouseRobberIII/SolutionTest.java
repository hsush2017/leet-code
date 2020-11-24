package medium.HouseRobberIII;

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
        TreeNode treeNode =
                new TreeNode(3,
                        new TreeNode(2,
                                null,
                                new TreeNode(3)
                        ),
                        new TreeNode(3,
                                null,
                                new TreeNode(1)
                        )
                );
        assertThat(sut.rob(treeNode)).isEqualTo(7);
    }

    @Test
    public void test2() {
        TreeNode treeNode =
                new TreeNode(3,
                        new TreeNode(4,
                                new TreeNode(1),
                                new TreeNode(3)),
                        new TreeNode(5,
                                null,
                                new TreeNode(1))
                );
        assertThat(sut.rob(treeNode)).isEqualTo(9);
    }

    @Test
    public void test3() {
        TreeNode treeNode =
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(1),
                                null
                        ),
                        null
                );
        assertThat(sut.rob(treeNode)).isEqualTo(3);
    }

    @Test
    public void test4() {
        TreeNode treeNode =
                new TreeNode(4,
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3),
                                        null),
                                null),
                        null
                );
        assertThat(sut.rob(treeNode)).isEqualTo(7);
    }
}