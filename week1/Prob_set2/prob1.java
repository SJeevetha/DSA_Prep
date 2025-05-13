/*Write a program which takes two values x and y. Prints x for y number of times.
Input:
2 
3
Expected Output
2
2
2 */

import java.util.Scanner;

public class prob1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}
