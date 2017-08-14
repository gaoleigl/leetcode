package BinaryTree;

import common.TreeNode;

/**
 * Created by GL on 2017/8/14.
 * 合并两个二叉树，如果又重叠就把value相加，简单的递归，需要注意的是如果两个树又一个为null，直接返回另一个就行了。
 */
public class MergeTwoBinaryTrees_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;

        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);

        return root;
    }
}
