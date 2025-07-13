// https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        if(head.next==null){
            return head.data;
        }
        Node temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count>1){
            count=(count/2)+1;
        }
        temp=head;
        int n=1;
        while(n<count){
            temp=temp.next;
            n++;
        }
        return temp.data;
        
    }
}
