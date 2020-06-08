package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

    class RandomListNode {
        int val;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.val = x;
        }
    }
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode p = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode q = dummy;

        while (p != null) {
            q.next = new RandomListNode(p.val);
            map.put(p, q.next);
            p = p.next;
            q = q.next;
        }
        p = head;
        q = dummy;
        while (p != null) {
            q.next.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return dummy.next;
    }
}
