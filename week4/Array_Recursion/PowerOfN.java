/* Write a Program to find the power of a number recursively. Take two inputs, number and the power.
Example:
Input: 2 3
Output: 8
Explanation : 2^3 is 8

Example:
Input: 5 2
Output: 25
Explanation: 5^2 is 25   */

class PowerOfN {
    static int func(int n, int m){
    if(m==0){
        return 1;
    }
    return n * func(n,m-1);
}
    public static void main(String[] args) {
        System.out.println(func(3,3));
    }
}
