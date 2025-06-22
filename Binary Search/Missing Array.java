// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// Using Binary Search
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            int mid=i+j/2;
            if(arr[mid]==mid+1)
             i=mid+1;
            else
             j=mid;
        }
        if(j+1==arr[n-1])
         return n+1;
        return j+1;
    }
}
