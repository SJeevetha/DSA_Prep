/*Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen. */
import java.util.Scanner;

public class prob1{
    public static void main(String[] args) {
        System.out.println("Enter the input:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = sc.next();
        char character = sc.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(character);

    }
}
