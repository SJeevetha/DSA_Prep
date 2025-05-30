// It is a Optimised Approach of solving a PERFECT NUMBER in java
/*sample input:
   n = 28   
   output: Perfect number
   Explanation: 1+2+14+4+7 = 28

   n = 6
   output: Perfect number
   
   n = 12
   output: Not a Perfect number  */

import java.util.Scanner;
class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                sum = sum+i;
                if(n/i != i){
                    sum = sum+(n/i);
                }
            }
            
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        
    }
}
