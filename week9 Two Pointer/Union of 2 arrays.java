// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                if(result.size()==0 || result.get(result.size()-1)!=b[j]){
                    result.add(b[j]);
                }
                j++;
            }
            else{
                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<a.length){
                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
                   result.add(a[i]);   
                }
                i++;
        }
        while(j<b.length){
                if(result.size()==0 || result.get(result.size()-1)!=b[j]){
                   result.add(b[j]);   
            }
            j++;
        }
        return result;
    }
}
