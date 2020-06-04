package com.practice;

import java.util.Stack;

public class MaximumDepthOfBinaryTree {
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // method 1
        // return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

        // method 2
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        nodeStack.push(root);
        depthStack.push(1);
        int max = 0;

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int temp = depthStack.pop();
            max = Math.max(temp, max);

            if (node.left != null) {
                nodeStack.push(node.left);
                depthStack.push(temp + 1);
            }

            if (node.right != null) {
                nodeStack.push(node.right);
                depthStack.push(temp + 1);
            }
        }
        return max;
    }
}
