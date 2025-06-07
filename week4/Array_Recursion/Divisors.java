/*  Write a program to print the divisors of a number recursively.

Example:
Input: 6

Output: 1 2 3 6

Example:

Input: 12

Output: 1 2 3 4 6 12            */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        divisors(a,1);
    }
    
     static void divisors(int n,int i){
        if(i>n)
         return ;
         if(n%i==0){
            System.out.print(i+" ");
            divisors(n,i+1); 
         }
        else
           divisors(n,i+1); 
       }
    }
