// https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1

class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        // code here
        boolean[] isPrime = new boolean[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        
        //initialising all numbers as true
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        // Sieve algorithm
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime[i]==true){
                for(int j=i*2;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        // Adding the prime numbers into the array list
        for(int i=2;i<=n;i++){
            if(isPrime[i]==true){
                result.add(i);
            }
        }
        return result;
    }
}
