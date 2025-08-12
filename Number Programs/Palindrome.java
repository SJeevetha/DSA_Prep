// A palindromic number is a number that remains the same when its digits are reversed. Like 16461, for example,

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse=0;
        int num=n;
        while(num>0){
            int r = num%10;
            reverse = reverse*10 + r;
            num = num/10;
        }
        if(reverse==n)
          System.out.println("Palindrome Number");
        else
          System.out.println(" Not a Palindrome Number");
        
  }
         
}
