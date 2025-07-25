// https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty()) 
                  return false;
                char top = stack.pop();
                if(ch==')'){
                    if(top!='(')
                      return false;
                }
                else if(ch=='}'){
                    if(top!='{')
                      return false;
                }
                else{
                    if(top!='[')
                      return false;
                }
            }
        }
        if(stack.isEmpty())
           return true;
        return false; 
    }
}
