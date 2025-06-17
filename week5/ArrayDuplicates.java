// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

/* Note: GeeksforGeeks is looking for optimised solution but you have learnt only brute force so far, but still solve it, you will get time limit execeeded 
but still 1110 test cases will pass, so go ahead and solve and submit, once you learn optimised solution, then you can again submit.   */

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    boolean flag = false;
                    for(int k=0;k<res.size();k++){
                        if(res.get(k)==arr[i]){
                            flag=true;
                            break;
                        }
                    }
                    if(flag==false)
                      res.add(arr[i]);
                }
            }
        }
        
        return res;  
    }
}
