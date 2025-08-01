// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int sumfirst=0;
        int sumend=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sumfirst = arr[i]+sumfirst;
            if(sumend<sumfirst){
                sumend = sumfirst;
            }
            if(sumfirst<0)
              sumfirst=0;
        }
        return sumend;
    }
}
