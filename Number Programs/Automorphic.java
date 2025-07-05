/* An Automorphic number is a number whose square “ends” in the same digits as the number itself. 
   Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625  */ 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int c=0;
        while(temp>0){
            temp=temp/10;
            c++;
        }
        int square=n*n;
        int squarelast = square%(int)Math.pow(10,c);
        if(squarelast==n)
         System.out.println("Automorphic Number");
        else
            System.out.println("Not a Automorphic Number");
  }
}
