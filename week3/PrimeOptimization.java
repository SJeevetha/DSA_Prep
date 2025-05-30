// It is a optimized method of solving the prime number which is less time complexity for more than 3 digits.

import java.util.Scanner;
class PrimeOptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
               flag = 0;
            }
        }
        if(flag==1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        
    }
}
