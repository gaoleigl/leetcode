package LinkedList;

import common.ListNode;


/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p1 = head,p2 = head.next,p3 = null;
        while(p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        return p1;
    }
}
