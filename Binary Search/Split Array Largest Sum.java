// https://leetcode.com/problems/split-array-largest-sum/description/
// As same as the "Capacity of ships weights"

class Solution {
    public int getSplit(int[] nums,int cap){
        int ways=1,sum=0;
        for(int num:nums){
            if(sum+num<=cap)
             sum+=num;
            else{
                sum=num;
                ways++;
            } 
        }
        return ways;
    }
    public int splitArray(int[] nums, int k) {
        int low=nums[0],high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int way=getSplit(nums,mid);
            if(way<=k){
                ans=mid;
                high=mid-1;
            }
            else
             low=mid+1;
        }
        return ans;
    }
}
