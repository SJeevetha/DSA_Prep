// https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

class Solution {
    ArrayList<Integer> countDistinct(int a[], int k) {
        // code here
        int n = a.length;
        int i = 0, j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (j < n) {
            map.put(a[j], map.getOrDefault(a[j], 0) + 1);

            if (j - i + 1 == k) {
                result.add(map.size());

                // Remove the i-th element from the window
                map.put(a[i], map.get(a[i]) - 1);
                if (map.get(a[i]) == 0) {
                    map.remove(a[i]);
                }

                i++;
            }
            j++;
        }
        return result;

    }
}
