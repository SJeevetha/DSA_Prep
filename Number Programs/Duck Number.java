/* A Duck number is a number which has zeroes present in it, 
but there should be no zero present in the beginning of the number. 
For example 3210
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int num=n;
        while(num>0){
            int r = num%10;
            if(r==0)
              flag=true;
            num = num/10;  
        }
        if(flag)
          System.out.println("Duck Number");
        else
          System.out.println("Not a Duck Number");
    }
}
