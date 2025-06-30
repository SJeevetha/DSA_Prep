// https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n= arr.size();
        int l=0,h=n-1;
        while(l<=h){
            if(arr.get(l)<=arr.get(h))
             return l;
            int mid = l+((h-l)/2);
            int i = (mid-1+n)%n;
            int j = (mid+1)%n;
            if(arr.get(mid)<arr.get(i) && arr.get(mid)<arr.get(j))
              return mid;
            if(arr.get(mid)<arr.get(h))
             h=mid-1;
            else
             l=mid+1;
        }
        return 0;
    }
}
