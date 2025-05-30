// Optimized approach of calculating the divisors of a given number

import java.util.Scanner;
class DivisorsOptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
               System.out.print(i+" ");
               if(n/i != i){
                   System.out.print(n/i+" ");
               }
            }
            
        }
       
    }
}
