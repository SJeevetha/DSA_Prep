// https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node current = head;
        Node temp=null;
        Node newnode=null;
        
        while(current!=null){
            newnode=current.next;
            current.next=temp;
            temp=current;
            current=newnode;
        }
        head=temp;
        return head;
    }
}
