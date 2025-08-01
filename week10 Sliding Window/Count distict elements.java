// https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n = arr.length;
        int i = 0, j = 0;

        // To store frequency of elements in the current window
        Map<Integer, Integer> freqMap = new HashMap<>();

        // To store the result
        ArrayList<Integer> result = new ArrayList<>();

        while (j < n) {
            // Step 1: Add arr[j] to the frequency map
            freqMap.put(arr[j], freqMap.getOrDefault(arr[j], 0) + 1);

            // Step 2: If window size is less than k, just expand the window
            if (j - i + 1 < k) {
                j++;
            }

            // Step 3: If window size is equal to k
            else if (j - i + 1 == k) {
                // Add the number of distinct elements (map size) to result
                result.add(freqMap.size());

                // Slide the window: remove or reduce count of arr[i]
                freqMap.put(arr[i], freqMap.get(arr[i]) - 1);

                if (freqMap.get(arr[i]) == 0) {
                    freqMap.remove(arr[i]);
                }

                i++;
                j++;
            }
        }

        return result;
    }
}
