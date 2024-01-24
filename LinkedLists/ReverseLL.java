package LinkedLists;
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode;
        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}