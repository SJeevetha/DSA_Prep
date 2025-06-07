/*  Write a recursive program to find the sum of digits of a number.

Example:

Input: 342

Output: 9



Example 2:
Input: 34534

Ouput: 19*/

class Main {
    public static void main(String[] args) {
        int res = sumdigit(342);
        System.out.print(res);
    }
    
     static int sumdigit(int n){
        if(n==0)
         return 0;
        int r = n%10;
        return r+sumdigit(n/10);
    }
}
