/*Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.

Examples:  
Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60

Input : L = 15, R = 25
Output : Sum = 59

Note: Use sieve of eratosthenes to solve the problem */

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        boolean[] isPrime = new boolean[R + 1];
        ArrayList<Integer> prime = new ArrayList<>();
      //Initializing all the numbers upto R as true
        for(int i=2;i<=R;i++){
            isPrime[i]=true;
        }
      //Sieve Algorithm
        for(int i=2;i<=Math.sqrt(R);i++){
            if(isPrime[i]==true){
                for(int j=i*2;j<=R;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
      //Adding prime numbers into the ArrayList
        for(int i=L;i<=R;i++){
            if(isPrime[i]==true){
                prime.add(i);
            }
        }
        System.out.print(prime+" ");
        
        System.out.println();

      //Executing the prime numbers as individual elements 
        for(int num:prime)
          System.out.print(num+" ");

      // Adding the prime numbers
        int sum =0;
        for(int i=L;i<=R;i++){
            if(isPrime[i]==true){
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.print(sum);
    }
}
