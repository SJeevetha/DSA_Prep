// The least common multiple, lowest common multiple, or smallest common multiple of two integers a and b, 
// usually denoted by LCM(a, b), is the smallest positive integer that is divisible by both a and b.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = (a<b) ? a : b;
        int gcd = 1;
        for(int i=2;i<=n;i++){
            if(a%i==0 && b%i==0)
              gcd = i;
        }
        int lcm = (a*b)/gcd;
        System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
        
 }
         
}
