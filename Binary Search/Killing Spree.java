// https://www.geeksforgeeks.org/problems/killing-spree3020/0

class Solution {

    long killinSpree(long n) {
        // Code Here
        long l=1,h=(long)Math.sqrt(n);
        long ans=0;
        while(l<=h){
            long mid = l+((h-l)/2);
            long sum = (mid*(mid+1)*(2*mid+1))/6;
            if(sum>n)
             h=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
        
    }
}
