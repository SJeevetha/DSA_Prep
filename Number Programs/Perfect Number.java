// A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. 
// For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorsum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                factorsum = factorsum+i;
            }
        }
        if(factorsum==n)
          System.out.println("Perfect Number");
        else
          System.out.println("Not a Perfect Number");
        
  }
         
}
