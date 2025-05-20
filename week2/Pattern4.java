/*Given a number N. The task is to print a series of asterisk(*) from 1 till N terms with increasing order and difference being 1.
Example 1:
Input:
N = 3
Output:
* ** ***
Explanation:
First, print 1 asterisk then space after
that print 2 asterisk and space after that 
print 3 asterisk now stop as N is 3.*/
class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.print(" ");
       }
    }
}
