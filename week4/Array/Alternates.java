// https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1

class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                result.add(arr[i]);
            }
        }
        return result;
    }
}
