// https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp=head;
        int total=0;
        while(temp!=null){
            temp=temp.next;
            total++;
        }
        if(k>total)
          return -1;
        
        temp=head;
        int x = total-k;
        while(x>0){
            temp=temp.next;
            x--;
        }
        return temp.data;
    }
}
