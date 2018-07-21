package com.quxionglie.leecode.q002;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 2018/7/17.
 *
 * @author qu.xionglie
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        // 342 + 465 = 807
        int[] array1 = new int[]{3, 4, 2};
        int[] array2 = new int[]{4, 6, 5};

        ListNode l1 = null;
        ListNode l2 = null;

        for (int i : array1) {
            ListNode head = new ListNode(i);
            if (l1 != null) {
                head.next = l1;
            }
            l1 = head;
        }
        for (int i : array2) {
            ListNode head = new ListNode(i);
            if (l2 != null) {
                head.next = l2;
            }
            l2 = head;
        }
        ListNode result = new Solution().addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);

    }
}