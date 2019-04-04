import java.util.ArrayList;
import java.util.List;

/**
* @Description: N叉树的后序遍历
* @Param:
* @return:
* @Author: 文兆杰
* @Date: 2019/4/4
*/
public class Solution6 {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if (root == null ) {
            return list;
        }
        for (Node child : root.children) {
            postorder(child);
        }
        list.add(root.val);
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
