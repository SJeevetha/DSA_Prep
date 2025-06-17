// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

// 1.  Brute Force Approach [o(n^2)]
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag)
               res.add(arr[i]);
        }
        res.add(arr[n-1]);
        
        return res;
    }
}

// 2.Optimal Approach [o(n)]
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int max = arr[n-1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(max); // last element is always a leader
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                res.add(arr[i]);
            }
        }
        
        Collections.reverse(res); // reverse to get correct order
        return res;
    }
}
