// https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null || k<=1)
          return head;
          
        Node current = head;
        Node prevtail = null;
        Node newhead = null;
        
        while(current!=null){
            Node segment = current;
            Node prev = null;
            Node next = null;
            int count=0;
            while(current!=null && count<k){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if(newhead == null)
              newhead = prev;
            
            if(prevtail != null)
              prevtail.next = prev;
              
            prevtail = segment;  
        }
        return newhead;
    }
}
