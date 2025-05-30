// Problem Link:  https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

class GCD {
    public static int gcd(int a, int b) {
        // code here
        int gcdv = 1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcdv = i; 
            }
        }
        return gcdv;
        
    }
}
