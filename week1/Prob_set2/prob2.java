
import java.util.Scanner;
/*Write a program to take x and print multiples of x till 1000. */
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=x;i<=1000;i=i+x){
            System.out.println(i);
        }
    }
}
