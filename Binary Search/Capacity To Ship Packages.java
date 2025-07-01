// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    public int getDays(int[] weights,int cap){
        int days=1,sum=0;
        for(int weight:weights){
            if(sum+weight<=cap)
             sum+=weight;
            else{
                sum=weight;
                days++;
            } 
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0],high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        int ans=low;
        while(low<=high){
            int mid = (low+high)/2;
            int day = getDays(weights,mid);
            if(day<=days){
                ans=mid;
                high=mid-1;
            }
            else
              low=mid+1;
        }
        return ans;
    }
}
