// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
/*  Brute Force Approach isn't accepted in GeeksforGeeks so you won't be able to submit but give it a shot. */

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                    count++;
            }
        }
        return count;
    }
}
