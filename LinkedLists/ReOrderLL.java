package LinkedLists;

public class ReOrderLL {

}
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){return;}
        ListNode fast, slow, prev;
        fast = head; // tail of second half
        slow = head;
        prev = null; // tail of first half
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = head; // head of first half
        ListNode l2 = reverse(slow); // head of second half

        merge(l1,l2);
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode currNode = head;
        ListNode next;
        while(currNode!=null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2){
        while(l1!=null){
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;

            if(l1Next == null){
                break;
            }
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
    }
}
