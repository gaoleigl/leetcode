package BinaryTree;

import com.sun.javafx.scene.control.skin.LabeledImpl;
import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2016/6/8 0008.
 */
public class BinaryTreePreorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root != null)
            stack.push(root);
        while (!stack.empty()) {
            TreeNode tmp = stack.pop();
            res.add(tmp.val);
            if(tmp.right != null)
                stack.push(tmp.right);
            if(tmp.left != null)
                stack.push(tmp.left);
        }
        return res;
    }
}
