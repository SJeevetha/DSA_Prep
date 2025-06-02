// https://www.geeksforgeeks.org/problems/count-odd-even/1

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int oddc=0;
        int evenc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenc++;
            }
            else{
                oddc++;
            }
        }
        return new int[]{oddc,evenc};
    }
}
