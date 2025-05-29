// Problem Link:  https://www.geeksforgeeks.org/problems/number-of-divisors1631/1?

class NumberOfDivisors {
    static int countDivisors(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i%3==0){
                    count = count+1;
                }
            }
        }
        return count;
    }
}
