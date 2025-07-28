// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=1&category=Stack&sortBy=submissions

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> b = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> newarr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            newarr.add(0);
        }

        stack.push(arr[0]);
        b.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                int idx = b.pop();                  // pop only once
                newarr.set(idx, arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
            b.push(i);
        }

        while (!b.isEmpty()) {
            newarr.set(b.pop(), -1);               // pop only once
            stack.pop();                           // optional if you don't need to clear it
        }

        return newarr;
    }
}
