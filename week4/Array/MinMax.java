// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        return new Pair(min,max);
    }
}
