package BinaryTree;

import common.TreeNode;

/**
 * Created by Administrator on 2016/6/19 0019.
 */
public class ConverSortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        if(nums.length == 1)
            return new TreeNode(nums[0]);
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int[] leftNum = new int[mid];
        System.arraycopy(nums, 0, leftNum, 0, mid);
        root.left = sortedArrayToBST(leftNum);

        if(nums.length - mid > 1) {
            int[] rightNum = new int[nums.length - mid -1];
            System.arraycopy(nums, mid+1, rightNum, 0, nums.length - mid -1);
            root.right = sortedArrayToBST(rightNum);
        }
        return root;
    }

}
