package easy.BinaryTreeTilt;

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
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int answer = sut.findTilt(treeNode);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, null, new TreeNode(7)));
        int answer = sut.findTilt(treeNode);
        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    public void test3() {
        TreeNode treeNode = new TreeNode(21,
                new TreeNode(7,
                        new TreeNode(1,
                                new TreeNode(3),
                                new TreeNode(3)),
                        new TreeNode(1)
                ),
                new TreeNode(14,
                        new TreeNode(2),
                        new TreeNode(2)
                )
        );

        int answer = sut.findTilt(treeNode);
        Assertions.assertThat(answer).isEqualTo(9);
    }
}