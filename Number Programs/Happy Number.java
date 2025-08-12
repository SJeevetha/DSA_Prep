/*
  In number theory, a happy number is a number which eventually reaches 1 when the number is replaced by the sum of the square of each digit. 
  For instance, 13 is a happy number because 
{\displaystyle 1^{2}+3^{2}=10}, and 
{\displaystyle 1^{2}+0^{2}=1}. 
On the other hand, 4 is not a happy number because the sequence starting with 
{\displaystyle 4^{2}=16} and 
{\displaystyle 1^{2}+6^{2}=37} eventually reaches 
{\displaystyle 2^{2}+0^{2}=4}, the number that started the sequence, and so the process continues in an infinite cycle without ever reaching 1. 
A number which is not happy is called sad or unhappy.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstno=0;
        int secondno=0;
        int squaresum=n;
        while(squaresum>0){
            firstno = (int) Math.pow(squaresum/10,2);
            secondno = (int) Math.pow(squaresum%10,2);
            squaresum = firstno + secondno;
            if(squaresum==1)
              break;
        }
        if(squaresum==1)
         System.out.println("Happy Number");
        else
         System.out.println("Sad Number");
        
        
    }
}
