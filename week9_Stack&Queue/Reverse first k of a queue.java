// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1?page=1&category=Stack&sortBy=submissions

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (q == null || k > q.size() || k <= 0) {
            return q; // Edge case: invalid k, return original
        }
        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=1;i<=q.size()-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}
