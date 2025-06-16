// https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

// 1.Brute Force Approach(using extra space)
class Solution {
    void pushZerosToEnd(int[] a) {
        int[] b = new int[a.length];
         int j=0;
         for(int i=0;i<a.length;i++){
             if(a[i]!=0){
                 b[j]=a[i];
                 j++;
             }
         }
         for(int i=j;i<a.length;i++){
             a[i]=0;
         }
         for(int i=0;i<j;i++){
             a[i]=b[i];
         }
    }
}

//2.Optimal Appraoch[not using extra space just altering the given array]
class Solution {
    void pushZerosToEnd(int[] a) {
         int j=0;
         for(int i=0;i<a.length;i++){
             if(a[i]!=0){
                 a[j]=a[i];
                 j++;
             }
         }
         for(int i=j;i<a.length;i++){
             a[i]=0;
         }
    }
}
