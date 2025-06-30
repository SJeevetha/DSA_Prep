// https://www.geeksforgeeks.org/problems/binary-search-in-forest--141631/1

class Solution {
    static int checkwood(int tree[],int n,int h){
        int wood=0;
        for(int i=0;i<n;i++){
            if(tree[i]>h)
             wood+=tree[i]-h;
        }
        return wood;
    }
    static int find_height(int tree[], int n, int k) {
        int low=0,high=tree[0];
        for(int i=0;i<n;i++){
            high = Math.max(tree[i],high);
        }
        while(low<=high){
            int mid = (low+high)/2;
            int wood = checkwood(tree,n,mid);
            if(wood==k)
             return mid;
            if(wood<k)
              high=mid-1;
            else
              low=mid+1;
        }
        return -1;
    }
}
