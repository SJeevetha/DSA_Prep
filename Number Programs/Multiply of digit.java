// If a number=1234, then 1*2*3*4 ,Multiply of digit=24

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul=1;
        int r=0;
        while(n>0){
            r = n%10;
            mul = mul*r;
            n = n/10;
        }
        System.out.println("Multiply of digit: "+mul);
        
 }
         
}
