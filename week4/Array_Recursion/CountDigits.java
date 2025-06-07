/* Write a recursive algorithm to find the count of digits in a number.

Example:
Input: 353445

Outpput: 6

Example 2 :

Input: 53543

Output: 5
*/

class Main {
    public static void main(String[] args) {
        int res = countzero(354478);
        System.out.print(res);
    }
    
     static int countzero(int n){
        if(n%10==n){
            if(n%10!=0)
             return 1;
            else
             return 0;
        }
        if(n%10!=0)
            return 1+countzero(n/10);
        else
         return 1+countzero(n/10);

    }
}
