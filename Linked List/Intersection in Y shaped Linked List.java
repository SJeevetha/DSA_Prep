// https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        int h1 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            h1++;
        }
        Node temp2 = head2;
        int h2 = 0;
        while(temp2 != null){
            temp2 = temp2.next;
            h2++;
        }
        int k=0;
        if(h1>h2){
            k = h1-h2;
            temp1 = head1;
            temp2 = head2;
        }
        else{
            k = h2-h1;
            temp1 = head2;
            temp2 = head1;
        }
        while(k>0){
            temp1 = temp1.next;
            k--;
        }
        while(temp1!=null && temp2!=null){
            if(temp1== temp2)
              return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
