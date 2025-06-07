// Input : 1 2 3 4 5
// potput: 1 2 3 4 5
// Explanation: Printing it using recursion.

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr,5,0);
    }
    
     static void printArray(int[] arr,int n,int i){
        if(i>=n)
         return;
        System.out.print(arr[i]+" ");
        printArray(arr,n,i+1);
    }
}
