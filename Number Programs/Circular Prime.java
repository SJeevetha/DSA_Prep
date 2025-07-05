/*  A circular prime is a prime number with the property that the number generated at each intermediate step
when cyclically permuting its digits will be prime. 
For example, 1193 is a circular prime, since 1931, 9311 and 3119 all are also prime. */

import java.util.Scanner;
class Main {
    static boolean isprime(int num){
         boolean flag=true;
         for(int i=2;i<num;i++){
             if(num%2==0){
                 flag=false;
                 break;
             }
         }
         return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        boolean flag=true;
        for(int i=1;i<=count;i++){
            int r = temp%10;
            temp=temp/10;
            temp = (r* (int)Math.pow(10,count-1))+temp;
            if(!isprime(temp)){
                flag=false;
                break;
            }
        }
            if(flag){
                System.out.println("Circular Prime");
            }
            else{
                System.out.println("Not a Circular Prime");
            }
  }
}
