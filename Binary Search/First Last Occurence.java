// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1

// 1.Brute force Approach
class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int firstOccur = -1,lastOccur=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x && firstOccur==-1)
              firstOccur=i;
            if(arr[i]==x)
              lastOccur=i;
        }
        result.add(firstOccur);
        result.add(lastOccur);
        
        return result;
    }
}

//2. Soved using THe binary Search

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Occurence(arr,x,true));
        result.add(Occurence(arr,x,false));
        return result;
    }
    
    private static int Occurence(int[] arr,int x,boolean first){
        int i=0,j=arr.length-1,ans=-1;
        while(i<=j){
            int mid= i+j/2;
            if(arr[mid]==x){
                ans = mid;
                if(first)
                    j = mid-1;
                else
                 i = mid+1;
            }
            else if(arr[mid]<x)
             i = mid+1;
             
            else
             j = mid-1;
        }
        return ans;
    }  
}
