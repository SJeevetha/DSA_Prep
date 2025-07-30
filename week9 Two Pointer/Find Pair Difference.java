// https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
               return true; 
            }
        }
        return false;
    }
}
