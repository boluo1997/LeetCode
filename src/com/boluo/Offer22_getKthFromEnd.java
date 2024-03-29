package boluo;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。
 * 这个链表的倒数第3个节点是值为4的节点。
 *
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 */

public class Offer22_getKthFromEnd {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;

        for(int i=0;i<k;i++){
            p = p.next;
        }

        while(p != null){
            p = p.next;
            q = q.next;
        }

        return q;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
