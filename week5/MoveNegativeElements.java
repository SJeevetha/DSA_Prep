// https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

class Solution {
    public void segregateElements(int[] a) {
        // Your code goes here
        int n = a.length;
        int[] b = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]>=0){
            b[j]=a[i];
            j++;
          }
        }
        for(int i=0;i<n;i++){
            if(a[i]<0){
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
    }
}
