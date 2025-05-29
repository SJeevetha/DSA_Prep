/* Write a program that gets n as input and print all the prime numbers till that number.
Testcase 1 :
Input : 
5
Expected output:
2 3 5

Testcase 2 :
Input : 
11
Expected output:
2 3 5 7 11         */
import java.util.Scanner;
class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            int flag = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = 1;
            }
          }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
        
    }
}
