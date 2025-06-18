// https://leetcode.com/problems/rotate-string/
// Solved using the substring , if you don't have idea about substring do learn it before solving this problem.
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        for(int i=1;i<=n;i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(goal))
              return true;  
        }
        return false;
    }
}
