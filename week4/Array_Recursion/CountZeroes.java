/*input: 20300
 output: 3     
Explanation: it counts the number of zeroes in a digit  */ 

class Main {
    public static void main(String[] args) {
        int res = countzero(40560);
        System.out.print(res);
    }
    
     static int countzero(int digit){
        if(digit%10==digit){
            if(digit%10==0)
              return 1;
            else
             return 0;
        }
         if(digit%10==0)
          return 1+countzero(digit/10);
         else
          return countzero(digit/10);
    }
}
