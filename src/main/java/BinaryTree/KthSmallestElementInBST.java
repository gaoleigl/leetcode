package BinaryTree;

import common.TreeNode;

import java.util.Stack;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(k > 0 && (stack!= null || root != null)) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(--k == 0) return root.val;
            root = root.right;
        }
        return 0;
    }
}
