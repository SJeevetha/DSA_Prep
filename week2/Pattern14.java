/*Input:
n = 8
Expected output:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8     */
import java.util.Scanner;
class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for(int i=1;i<=n;i++){
            count = i;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
