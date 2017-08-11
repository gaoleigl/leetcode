package LinkedList;

import common.ListNode;

/**
 * Created by Administrator on 2016/6/15 0015.
 */
public class OddEvenLinkedList_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(odd.next!=null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
