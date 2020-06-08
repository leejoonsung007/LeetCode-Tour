package com.practice;

import java.awt.*;

public class RemoveNthFromEnd {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode pointer = dummyHead;
        int length = 0;

        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }

        int steps = length - n;
        pointer = dummyHead;
        while (steps > 0) {
            pointer = pointer.next;
            steps--;
        }

        pointer.next = pointer.next.next;
        return dummyHead.next;
    }
}
