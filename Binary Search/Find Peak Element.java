// https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        int i=0,j=nums.length-1;
        if(nums.length==1){
         return 0;
        }
        while(i<j){
            int mid = i+((j-i)/2);
            if(mid==0)
             return nums[j]>nums[i] ? j : i;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
             return mid;
            if(nums[mid]>nums[mid-1])
              i = mid+1;
            else
              j=mid-1;    
        }
         return i;
    }
}
