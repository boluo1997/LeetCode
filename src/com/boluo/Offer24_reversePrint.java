package boluo;

import java.util.Stack;

//倒序打印链表到数组中
public class Offer24_reversePrint {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int[] nums = new int[stack.size()];

        for(int i=0;i<nums.length;i++){
            nums[i] = stack.pop().val;
        }

        return nums;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
