package com;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，
 * 你将只被给定要求被删除的节点。
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 */
public class Test02_deleteNode {
    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
