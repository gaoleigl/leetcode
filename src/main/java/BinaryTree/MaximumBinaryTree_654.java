package BinaryTree;

import common.TreeNode;

import java.util.Arrays;

/**
 * Created by GL on 2017/8/11.
 * 这里定义了最大二叉树的概念，数组转二叉树，根节点数字最大，数组中这个数左边的再组成最大的左子树，右边组成最大的右子树，典型的递归
 */
public class MaximumBinaryTree_654 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        // 数组为空时结束递归
        if(nums.length == 0) {
            return null;
        }
        //找出最大值和所在下标
        int maxNum = Integer.MIN_VALUE;
        int maxNumIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if(nums[i] > maxNum) {
                maxNum = nums[i];
                maxNumIndex = i;
            }
        }
        // 构建节点，递归左右子数，这里有个优化点就是不复制数组，用起点和终点标识
        TreeNode root = new TreeNode(maxNum);
        root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxNumIndex));
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxNumIndex + 1, nums.length));

        return root;
    }

    public static void main(String[] args) {
        TreeNode res = constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        System.out.println(res);
    }
}
