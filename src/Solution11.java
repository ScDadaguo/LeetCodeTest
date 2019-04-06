import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 94. 二叉树的中序遍历
 * @Param:
 * @return:
 * @Author: 文兆杰
 * @Date: 2019/4/4
 */
public class Solution11 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
