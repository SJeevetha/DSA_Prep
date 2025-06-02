// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        if(arr.length<2){
            return new int[]{-1};
        }
        int small,secSmall;
        if(arr[0]<arr[1]){
            small = arr[0];
            secSmall = arr[1];
        }
        else if(arr[0]>arr[1]){
            small = arr[1];
            secSmall = arr[0];
        }
        else{
            small = arr[0];
            secSmall = -1;
        }
        
        for(int i=2;i<arr.length;i++){
            int num = arr[i];
            if(num<small){
                secSmall = small;
                small = num;
            }
            else if(num>small && num<secSmall){
                secSmall = num;
            }
        }
        if(secSmall==-1){
            return new int[]{-1};
        }
        return new int[]{small,secSmall};
    }
}
