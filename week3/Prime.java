// Problem link:  https://www.geeksforgeeks.org/problems/prime-number2314/1
class Prime {
    static boolean isPrime(int n) {
        // code here
        int flag = 0;
            if(n==1){
                return false;
            }
            for(int j=2;j<n;j++){
                if(n%j==0){
                    flag=1;
                }
            }
            
        if(flag==0){
                return true;
            }
        else{
            return false;
        }        
    }
}
