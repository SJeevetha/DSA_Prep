// the greatest common divisor (gcd) of two or more integers, which are not all zero, 
// is the largest positive integer that divides each of the integers. 
// For example, the gcd of 8 and 12 is 4.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = (a<b) ? a : b;
        int gcd=1;
        for(int i=2;i<=n;i++){
            if(a%i==0 && b%i==0)
               gcd=i;
        }
        System.out.print(gcd);
    }
}
