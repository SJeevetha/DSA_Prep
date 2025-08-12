// A neon number is a number where the sum of digits of square of the number is equal to the number.
// For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int square = (int) Math.pow(n,2);
        while(square>0){
            int r = square%10;
            sum = sum+r;
            square = square/10;
        }
        if(sum==n)
          System.out.println("Neon Number");
        else
          System.out.println(" Not a Neon Number");
        
  }
         
}
