// To Check whether the given Array is sorted or not
/*  Input: n=5
           1 3 5 7 9
     Output: true     */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int[] arr = new int[a];
        for(int j=0;j<a;j++)
          arr[j]=sc.nextInt();
        System.out.print(SortArray(arr,a,0));
    }
    
     static boolean SortArray(int[] arr,int n,int i){
        if(i>=n-1)
         return true;
         if(arr[i]>arr[i+1])
           return false;
        return SortArray(arr,n,i+1); 
       }
    }
