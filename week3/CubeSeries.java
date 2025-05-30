// Problem Link:  https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + (int)Math.pow(i,3);
        }
        return sum;
    }
}
