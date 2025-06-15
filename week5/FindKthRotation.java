// https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int x=-1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                x = i;
                break;
            }
        }
        if(x!=-1)
          return x=x+1;
        return 0;  
        
    }
}
