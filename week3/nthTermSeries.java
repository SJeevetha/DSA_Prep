// Problem Link:  https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1

class Solution {
    static int findNthTerm(int n) {
        // code here
        int sum=1;
        for(int i=2;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
}
