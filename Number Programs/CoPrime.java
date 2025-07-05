/* Two integers a and b are said to be relatively prime, mutually prime, or coprime 
if the only positive integer that divides both of them is 1.
Example: 13 and 15 are co prime. */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = (a<b) ? a : b;
        boolean flag=true;
        for(int i=2;i<=n;i++){
            if(a%i==0 && b%i==0){
                flag=false;
                break;
            }
        }
        if(flag)
         System.out.println("CoPrime Number");
        else
          System.out.println("Not a CoPrime Number");
    }
}
