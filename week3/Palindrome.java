// Problem link:  https://www.geeksforgeeks.org/problems/palindrome0746/1

class  Palindome {
    public boolean isPalindrome(int n) {
        // Code here
        int sum=0;
        int num=n;
        while(n>0){
            int r = n%10;
            sum = sum*10+r;
            n = n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
