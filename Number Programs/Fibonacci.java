/* A series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc  */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        int c;
        for(int i = 1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
