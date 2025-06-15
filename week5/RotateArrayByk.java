// http://leetcode.com/problems/rotate-array/description/
// 1.Brute Force Approach
class Solution {
    public void rotate(int[] nums, int k) {
       int i=1;
        while(i<=k){
            int last = nums[nums.length-1];
          for(int j=nums.length-1;j>=1;j--){
              nums[j]=nums[j-1];
          }
          nums[0]=last;
          i++;
        } 
    }
}
// 2.OPTIMAL Approach
class Solution {
    public void rotate(int[] a, int k) {
       int n=a.length,j=0;
       k=k%n;
       int[] b = new int[n];
       for(int i=n-k;i<n;i++){
         b[j]=a[i];
         j++;
       }
       for(int i=0;i<n-k;i++){
         b[j]=a[i];
         j++;
       }
       for(int i=0;i<n;i++){
         a[i]=b[i];
       }

    }
}


