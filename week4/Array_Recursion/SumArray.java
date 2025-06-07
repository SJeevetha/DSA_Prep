/* Sum up the array elements
 Input: 1 2 3 4 5
  output: 15
  Expalnation: 1+2+3+4+5  = 15   */

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(Sum(arr,5,0));
    }
    
     static int Sum(int[] arr,int n,int i){
        if(i>=n)
         return 0;
        return arr[i]+Sum(arr,n,i+1); 
       }
    }
