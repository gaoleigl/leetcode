package common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp == null) {
                sb.append("null,");
                continue;
            }
            else
                sb.append(tmp.val +",");
            queue.add(tmp.left);
            queue.add(tmp.right);
        }
        return sb.toString();
    }
}
