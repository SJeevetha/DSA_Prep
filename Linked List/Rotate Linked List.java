// https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if (head == null || head.next == null || k == 0) 
          return head;
       int n=1;
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
           n++;
       }
       k = k%n;
       if (k == 0)
            return head;
       temp.next=head;        
       int i = 0;
       temp=head;
       while(i<k-1){
           temp=temp.next;
           i++;
       }
       head=temp.next;
       temp.next=null;
       
       return head;
    }
}
