// https://www.geeksforgeeks.org/problems/identical-linked-lists/1

/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        int c1=0;
        Node temp=head1;
        while(temp!=null){
            temp=temp.next;
            c1++;
        }
        temp=head2;
        int c2=0;
        while(temp!=null){
            temp=temp.next;
            c2++;
        }
        if(c1==c2){
            Node n1=head1;
            Node n2=head2;
            while(n1!=null){
                if(n1.data!=n2.data)
                  return false;
                n1=n1.next;
                n2=n2.next;
            }
            return true;
        }
        else{
            return false;
        }
        
    }
}
