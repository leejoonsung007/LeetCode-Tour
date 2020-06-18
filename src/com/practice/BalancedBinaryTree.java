package com.practice;

// 110. Balanced Binary Tree
// Example 1:
//
// Given the following tree [3,9,20,null,null,15,7]:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
// Return true.

public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getMaxDepth(root.left) - getMaxDepth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
    }

}
