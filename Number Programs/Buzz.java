/* A number is said to be Buzz Number if it ends with 7 or is divisible by 7. 
 Example: 1007 is a Buzz Number.   */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0 || n%10==7)
         System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
  }
}
