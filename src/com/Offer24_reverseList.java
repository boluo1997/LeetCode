package com;

import java.util.Stack;

public class Offer24_reverseList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head){
        /*
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;

        while(cur != null){

            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;

        }

        return pre;
        */

        /**
         * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
         */

        Stack<ListNode> stack = new Stack<>();

        //把原始链表倒序放到stack中
        while(head != null){
            stack.push(head);
            head = head.next;
        }

        //从栈中依次取出链表节点
        ListNode no = null;

        while(stack != null){
            no = stack.pop();
            no = no.next;
        }


        return no;

    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}




















