/*Write a program to check whether a triangle can be formed with the given values for the angles.
If sum of angles is equal to 180, then triangle can be formed, else it can't be formed. */
import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        System.out.println("Enter the three angles:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a+b+c;
        if(result==180){
            System.out.println("Trinagles are formed");
        }
        else{
            System.out.println("Triangles cannot be formed");
        }

    }
}
