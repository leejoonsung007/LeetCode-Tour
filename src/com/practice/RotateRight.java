package com.practice;

// 61. Rotate List
// Given a linked list, rotate the list to the right by k places, where k is non-negative.
// Example 1:
//
//Input: 1->2->3->4->5->NULL, k = 2
//Output: 4->5->1->2->3->NULL
//Explanation:
//rotate 1 steps to the right: 5->1->2->3->4->NULL
//rotate 2 steps to the right: 4->5->1->2->3->NULL

public class RotateRight {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        int length = 0;
        while (fast != null) {
            length++;
            fast = fast.next;
        }
        fast = head;
        for (int i = 0; i < k % length; i ++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
