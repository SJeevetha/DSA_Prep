// https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1

class Solution {
    public int getTime(int[] arr,int cap){
        int times=1,sum=0;
        for(int num:arr){
            if(sum+num<=cap)
              sum+=num;
            else{
                sum=num;
                times++;
            }  
        }
        return times;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low=arr[0],high=0;
        for(int num:arr){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int time= getTime(arr,mid);
            if(time<=k){
                ans=mid;
                high=mid-1;
            }
            else
              low=mid+1;
        }
        return ans;
    }
}
