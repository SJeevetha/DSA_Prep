// https://leetcode.com/problems/longest-common-prefix/submissions/1669655634/

class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int index= -1;
        for(int i=0;i<Math.min(last.length(),first.length());i++){
           if(last.charAt(i)!=first.charAt(i)){
            break;
           }
           index=i;
        }
        if(index==-1)
          return "";
        else
          return first.substring(0,index+1);  
    }
}
