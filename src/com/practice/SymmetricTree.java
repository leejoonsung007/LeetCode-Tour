package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {

    public static class TreeNode {
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

    // Solution1 - recursion
//    public boolean isSymmetric(TreeNode root) {
//        return isMirror(root.left, root.right);
//    }
//
//    private boolean isMirror(TreeNode node1, TreeNode node2) {
//        if (node1 == null && node2 == null)
//            return true;
//        if (node1 == null || node2 == null)
//            return false;
//
//        return node1.val == node2.val
//                && isMirror(node1.left, node2.right)
//                && isMirror(node1.right, node2.left);
//
//    }

    // Solution2 - iterative using stack
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();

            if (left == null && right == null) continue;
            else if (left == null || right == null || left.val != right.val) return false;
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
