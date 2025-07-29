// https://www.geeksforgeeks.org/problems/sort-a-stack/1?page=1&category=Stack&sortBy=submissions

import java.util.Stack;

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }
        // Step 1: Pop the top element
        int top = s.pop();

        // Step 2: Recursively sort the remaining stack
        sort(s);

        // Step 3: Insert the popped element back in sorted order
        insertInSortedOrder(s, top);

        return s;
    }

    // Helper method to insert element into stack in sorted order
    private void insertInSortedOrder(Stack<Integer> s, int x) {
        // If stack is empty or x is bigger than or equal to top, push
        if (s.isEmpty() || x >= s.peek()) {
            s.push(x);
            return;
        }

        // Else pop the top and recur
        int temp = s.pop();
        insertInSortedOrder(s, x);

        // Push the stored element
        s.push(temp);
    }
}
