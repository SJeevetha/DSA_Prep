/*
 Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
Input
Jeevetha
Sridharan
5

Expected output:
JeevethaSridharan
JeevethaSridharan
JeevethaSridharan
JeevethaSridharan
JeevethaSridharan
 */

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String firstname = sc.next();
       String secondname = sc.next();
       int num = sc.nextInt();
       for(int i=1;i<=num;i++){
         System.out.println(firstname+secondname);
       }
    }
}
