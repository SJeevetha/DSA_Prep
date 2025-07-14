// https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node prev = null;
        Node temp = head;
        Node newnode = new Node(key);

        // Case 1: Insert at beginning
        if (head == null || key < head.data) {
            newnode.next = head;
            return newnode;
        }

        // Traverse and find the correct position
        while (temp != null && temp.data < key) {
            prev = temp;
            temp = temp.next;
        }

        // Insert between prev and temp
        prev.next = newnode;
        newnode.next = temp;

        return head;
    }
}
