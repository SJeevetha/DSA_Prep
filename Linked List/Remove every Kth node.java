// https://www.geeksforgeeks.org/problems/remove-every-kth-node/1

/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if(k==1)
         return null;
        if(k==0)
         return head;
        Node temp=head;
        Node prev = null;
        int c=0;
        while(temp!=null){
            c++;
            if(c==k){
                prev.next=temp.next;
                c=0;
            }
            else{
                prev=temp;
            }
            temp=prev.next;
        }
        return head; 
    }
}
