/* Input: 23,78,90,45,60 
   Output: 2 
Explanation: As I want to search for th e target element of "90" if found print the index of that element in the array. */

class Main {
    public static void main(String[] args) {
        int[] arr={23,78,90,45,60};
        System.out.print(SearchArray(arr,5,0,90));
    }
    
     static int SearchArray(int[] arr,int n,int i,int target){
        if(i>=n)
         return -1;
       if(arr[i]==target)
           return i;
        else
          return SearchArray(arr,n,i+1,target);
       }
    }
