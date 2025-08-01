// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

// Brute force approach (not using the sliding window just using two for loops)
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<k;j++){
            if(arr[i]<0){
                neg.add(arr[i]);
                flag=true;
            }
          }
          if(!flag){
              neg.add(0);
          }
        }
        return neg;
    }
}

// 2. here th actual sliding window appraoch
import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int i = 0, j = 0;
        int n = arr.length;

        while (j < n) {
            // If current element is negative, add it to the queue
            if (arr[j] < 0) {
                q.add(arr[j]);
            }
            // Check if window size is less than k
            if (j - i + 1 < k) {
                j++;
            }
            // Window size is exactly k
            else {
                if (q.isEmpty()) {
                    result.add(0); // no negative in window
                } else {
                    result.add(q.peek()); // first negative in window
                }
                // Slide the window
                if (!q.isEmpty() && arr[i] == q.peek()) {
                    q.poll(); // remove the element leaving the window
                }
                i++;
                j++;
            }
        }

        return result;
    }
