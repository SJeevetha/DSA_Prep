
class Main {
    static final int MAX=100;
    static class Stack {
        int top;
        int[] a = new int[MAX];
        
        Stack() {
            top = -1;
        }
        
        boolean push(int x){
            if(top>=(MAX-1)){
                System.out.print("Stack is Overflow");
                return false;
            }
            else{
                a[++top]=x;
                System.out.println(x+" pushed into the Stack");
                return true;
            }
        }
        
        int pop(){
            if(top<0){
                System.out.print("Stack is Underflow");
                return 0;
            }
            else{
                int x = a[top--];
                return x;
            }
        }
        
        int peek(){
            if(top<0){
                System.out.print("Stack is Empty");
                return 0;
            }
            else{
                return a[top];
            }
        }
        
        boolean isEmpty(){
            return (top<0);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop()+" is poped from stack");
        System.out.println(s.pop()+" is poped from stack");
        System.out.println("After deleting the elements in stack are");
        while(!s.isEmpty()){
            System.out.println(s.peek()+" ");
            s.pop();
        }
    }
}
