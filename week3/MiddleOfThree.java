// Problem Link:  https://www.geeksforgeeks.org/problems/middle-of-three2926/1

class MiddleOfThree {
    int middle(int a, int b, int c) {
        // code here
        if(a>b && a>c){
            return b>c ? b:c;
        }
        else if(b>a && b>c){
            return a>c ? a:c;
        }
        else{
            return a>b ? a:b;
        }
    }
}
