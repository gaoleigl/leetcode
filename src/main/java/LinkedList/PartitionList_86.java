package LinkedList;

import common.ListNode;


/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class PartitionList_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode bigList = new ListNode(0);

        ListNode smallHead = smallList;
        ListNode bigHead = bigList;

        while(head != null) {
            if(head.val < x) {
                smallList.next = head;
                smallList = smallList.next;
            }
            else {
                bigList.next = head;
                bigList = bigList.next;
            }
            head = head.next;
        }
        //注意这里
        bigList.next = null;
        smallList.next = bigHead.next;
        return smallHead.next;
    }
}
