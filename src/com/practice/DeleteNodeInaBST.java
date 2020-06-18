package com.practice;

// 450. Delete Node in a BST
// Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
//
//Basically, the deletion can be divided into two stages:
//
//Search for a node to remove.
//If the node is found, delete the node.
//Note: Time complexity should be O(height of tree).
//
//Example:
//
//root = [5,3,6,2,4,null,7]
//key = 3
//
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Given key to delete is 3. So we find the node with value 3 and delete it.
//
//One valid answer is [5,4,6,2,null,null,7], shown in the following BST.
//
//    5
//   / \
//  4   6
// /     \
//2       7
//
//Another valid answer is [5,2,6,null,4,null,7].
//
//    5
//   / \
//  2   6
//   \   \
//    4   7
public class DeleteNodeInaBST {
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

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            if (root.left == null) {
                TreeNode rightNode = root.right;
                root.right = null;
                return rightNode;
            }
            else if (root.right == null) {
                TreeNode leftNode = root.left;
                root.left = null;
                return leftNode;
            }
            TreeNode successor = findMin(root.right);
            successor.right = delMin(root.right);
            successor.left = root.left;
            root.left = root.right = null;
            return successor;
        }
    }

    private TreeNode findMin(TreeNode node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    private TreeNode delMin(TreeNode node) {
        if (node.left == null) {
            TreeNode rightNode = node.right;
            node.right = null;
            return rightNode;
        }
        node.left = delMin(node.left);
        return node;
    }

}
