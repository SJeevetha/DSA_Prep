/* Write a program that gets n as input and print the reverse of the number
Testcase 1 :
Input : 
325345
Expected output:
543523

Testcase 2 :
Input : 
987987
Expected output:
789789      */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev=0;
        while(a>0){
           int r = a%10;
           rev = rev*10+r;
           a = a/10;
        }
        System.out.println(rev);
    }
}
