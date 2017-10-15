package com.leetcode.algorithms.problem2;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = l1.val + l2.val;
        boolean flag = sum >= 10;

        ListNode first = new ListNode(sum % 10);
        ListNode last = first;
        if (flag) {
            last.next = new ListNode(1);
        }
        while (l1.next != null || l2.next != null) {
            if (l1.next == null) {
                l1 = new ListNode(0);
            } else {
                l1 = l1.next;
            }

            if (l2.next == null) {
                l2 = new ListNode(0);
            } else {
                l2 = l2.next;
            }
            sum = l1.val + l2.val;
            if (flag) {
                sum += 1;
                flag = false;
            }

            flag = sum >= 10;
            ListNode current = new ListNode(sum % 10);
            last.next = current;
            last = current;
            if (flag) {
                last.next = new ListNode(1);
            }
        }

        return first;
    }
}
