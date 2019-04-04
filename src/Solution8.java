import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的后序遍历
 * @Param:
 * @return:
 * @Author: 文兆杰
 * @Date: 2019/4/4
 */
public class Solution8 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;

    }
}
