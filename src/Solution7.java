
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 二叉树的前序遍历
 * @Param:
 * @return:
 * @Author: 文兆杰
 * @Date: 2019/4/4
 */
public class Solution7 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
