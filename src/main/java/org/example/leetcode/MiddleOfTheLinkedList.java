package org.example.leetcode;

import org.example.leetcode.sub.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        var n1 = head;
        var n2 = head;

        while (n2 != null && n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return n1;
    }
}
