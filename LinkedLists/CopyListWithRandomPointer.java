package LinkedLists;

public class CopyListWithRandomPointer {
    
}
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node curr = head;
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node copied_head = curr.next;
        Node copied_curr = copied_head;

        while(copied_curr != null){
            curr.next = copied_curr.next;
            if(curr.next!=null){
                copied_curr.next = copied_curr.next.next;
            }
            curr = curr.next;
            copied_curr = copied_curr.next;
        }
        return copied_head;
    }
}