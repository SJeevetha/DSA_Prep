// https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1

class Solution {

    static int search(int arr[], int x) {

        // Your code here
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag = i;
            }
        }
        return flag;
    }
}
