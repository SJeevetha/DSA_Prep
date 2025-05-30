// Problem Link:  https://www.geeksforgeeks.org/problems/special-odd-series-sum1235/1

class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        int s = 0, odds=0;
        for(int i=1;i<=2*n-1;i+=2){
            s = s+i;
            odds = odds+s;
        }
        return odds;
    }
}
