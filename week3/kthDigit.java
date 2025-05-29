  // Problem link   :     https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/0
class kthDigit {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int k = 1;
        int count=0;
        long power = (long)Math.pow(a,b);
        System.out.println(power);
        while(power>0){
           long digit = power%10;
           count = count+1;
           power = power/10;
           if(count==k){
               System.out.println(digit);
           }
        }
    }
}
