// https://www.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/0

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // code here
        int max=arr1[0];
        int min=arr2[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min){
                min = arr2[i];
            }
        }
        return max*min;
        
    }
}
