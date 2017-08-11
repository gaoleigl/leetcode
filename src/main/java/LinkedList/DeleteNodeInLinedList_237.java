package LinkedList;

import common.ListNode;

/**
 * Created by Administrator on 2016/6/11 0011.
 */
public class DeleteNodeInLinedList_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
