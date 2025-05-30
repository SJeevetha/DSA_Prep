// Problem link:  https://www.geeksforgeeks.org/problems/special-series-sum0903/1

class Solution {
    static long sumOfTheSeries(long n) {
        // code here
        int series = 1;
        int sp = 1;
        for(int i=2;i<=n;i++){
            series = series+i;
            sp = sp+series;
        }
        return sp;
    }
}
