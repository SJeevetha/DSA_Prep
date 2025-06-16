/* https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
NOTE:
  As the below code is for the basic understanding of removing the duplicates in a array. It's a brute force approach.
 [not satisfies the above problem test cases] 
 For optimal answer do check out in "RemoveDuplicatesSorted(1)" in my week5 github repo.
 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // int[] a = {1,2,2,3,4,5,6,7,8,8,8,9,9};
        // int[] a = {2,2,2,2,2};
        int[] a = {1,2,4};
         removeduplicates(a);
    }
    
     static void removeduplicates(int[] a){
         int n = a.length;
         int[] b = new int[n];
         int j=0;
         for(int i=0;i<n-1;i++){
             if(a[i]!=a[i+1]){
                 b[j]=a[i];
                 j++;
             }
         }
       // Adding the last element
         b[j]=a[n-1];
         j++;
         //Printing the elements upto filled in array "b"
         for(int i=0;i<j;i++)
           System.out.print(b[i]+" ");
           
           System.out.println();
         // Printing the size of the array "b" that got filled.  
        System.out.print(j); 
         
     }
}
