// LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// GeeksForGeeke: https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
          int mid = l+((h-l)/2);
          int i = (mid-1+n)%n;
          int j = (mid+1)%n;
          if(nums[mid]<nums[i] && nums[mid]<nums[j])
            return nums[mid];
          if(nums[h]>nums[mid])
            h = mid-1;
          else
            l = mid+1;     
        }
         return nums[0];
    }
}
