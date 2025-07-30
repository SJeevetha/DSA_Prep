// https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                if(res.size()==0 || res.get(res.size()-1)!=a[i]){
                res.add(a[i]);
             }
             i++;
             j++;
           }
        }
        return res;
    }
}
