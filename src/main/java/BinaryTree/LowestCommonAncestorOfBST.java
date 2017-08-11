package BinaryTree;

import common.TreeNode;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(Math.max(p.val, q.val) < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(Math.min(p.val, q.val) > root.val)
            return lowestCommonAncestor(root.right,p,q);
        else
            return root;
    }
}
