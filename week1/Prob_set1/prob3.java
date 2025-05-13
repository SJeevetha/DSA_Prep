/*
 Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greaer than or equal to 35
Fail if mark is lesser than 35
 */
import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        System.out.println("Enter the mark:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=60){
            System.out.println("Grade C");
        }
        else if(marks>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("FAIL");
        }

    }
}
