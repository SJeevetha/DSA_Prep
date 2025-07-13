// https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1

/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newnode = new Node(x);
        
        if(head==null){
            return newnode;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count%2==0)
          count=(count/2);
        else
          count=(count/2)+1;
          
        temp=head;
        int n=1;
        while(n<count){
            temp=temp.next;
            n++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        
        return head;
          
    }
}
