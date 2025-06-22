// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?
// This is the brute force appraoch Do check the "CeilTheFloor(1)" for optimal solution
class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int floor=-1;
        int ceil=-1;
        for(int i=0;i<n;i++){
           if(arr[i]<=x)
             floor = arr[i];
           if(arr[i]>=x && ceil==-1)
             ceil=arr[i];
        }
        
        return new int[]{floor,ceil};
        
    }
}
