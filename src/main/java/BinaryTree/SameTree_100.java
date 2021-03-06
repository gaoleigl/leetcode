package BinaryTree;

import common.TreeNode;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        return (p!=null && q != null && p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}
