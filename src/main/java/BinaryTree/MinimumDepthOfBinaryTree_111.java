package BinaryTree;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class MinimumDepthOfBinaryTree_111 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.right != null && root.left != null)
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
