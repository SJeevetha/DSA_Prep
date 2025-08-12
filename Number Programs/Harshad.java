// In mathematics, a harshad number (or Niven number) in a given number base is an integer that is divisible by the sum of its digits when written in that base.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int r=0;
        int sum=0;
        while(num>0){
            r = num%10;
            sum = sum + r;
            num = num/10;
        }
        if(n%sum==0)
         System.out.println("Harshad Number");
        else{
            System.out.println("Not a Harshad Number");
        }
 }
         
}
