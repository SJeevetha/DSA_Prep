// https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
// Do check out in "RemoveDuplicatesSorted" in week5 for better understanding of this code.

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] a) {
        // Code Here
        int n = a.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[n-1];
        j++;
        
        return j;
    }
}
