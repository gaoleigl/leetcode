package BinaryTree;

import common.TreeNode;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class CountCompleteTreeNudes_222 {
    public static int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        TreeNode tmp = root.left;

        while (tmp != null){
            leftDepth ++;
            tmp = tmp.left;
        }

        tmp = root.right;
        while (tmp != null) {
            rightDepth ++;
            tmp = tmp.right;
        }

        if(leftDepth == rightDepth)
            return (1<<(leftDepth+1)) -1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        int leftDepth = 1;
        System.out.println(1<<(leftDepth + 1));
        System.out.println(1<<(leftDepth + 1) - 1);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(countNodes(root));
    }
}
