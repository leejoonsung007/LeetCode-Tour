package com.practice;

// 145. Binary Tree Postorder Traversal
// Example:
//
// Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
// Output: [3,2,1]

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) return;
        helper(node.left, res);
        helper(node.right, res);
        res.add(node.val);
    }
}
