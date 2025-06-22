// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
// Brute force approach
class Solution {
    int findOnce(int[] arr) {
        // Complete this function
        int n = arr.length;
        if(n==1)
          return arr[0];
        for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
      // if unique element appear at last
        return arr[n - 1];
    }
}
// Binary Search(not with in the time limit)
class Solution {
    int findOnce(int[] arr) {
        int n = arr.length-1;
        int i=0,j=n-1;
        while(i<=j){
            int mid = i+j/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1])
                    i=mid+1;
                else
                 j=mid-1;
            }
            else{
                if(arr[mid]==arr[mid-1])
                 i = mid+1;
                else
                 j=mid-1;
            }
        }
        return arr[i];
        
    }
}

// 2.with in the time limit
class Solution {
    int findOnce(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(mid%2==1) mid--;
            
            if(arr[mid]==arr[mid+1])
                i=mid+2;
            else
                j=mid;
            }
            
        return arr[i];
        
    }
}
