package boluo;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 */
public class Others_kthToLast {
    public static void main(String[] args) {

    }

    public int kthToLast(ListNode head, int k){

        ListNode p = head;
        ListNode q = head;

        for(int i=0;i<k;i++){
            q = q.next;
        }

        while(q != null){
            p = p.next;
            q = q.next;
        }

        return p.val;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}


