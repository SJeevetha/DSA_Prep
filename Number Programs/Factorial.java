/* Example : n = 5
    output:  120
     Expanation: 1*2*3*4*5 = 120   */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1;
        while(n>0){
            factorial = n*factorial;
            n--;
        }
        System.out.println(factorial);
        
    }
}
