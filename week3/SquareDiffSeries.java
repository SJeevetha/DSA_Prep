// Problem Link:  https://www.geeksforgeeks.org/problems/squares-difference0939/1

class Solution {
    static long squaresDiff(int N) {
        // code here
        long sum = (long)N*(N+1)/2;
        long sqsum = (long)N*(N+1)*(2*N+1)/6;
        long square = sum*sum;
        long diff = sqsum - square;
        return Math.abs(diff);
    }
}
