// Print numbers from 1 to N;

class Main {
    public static void main(String[] args) {
       printN(1);
       System.out.println("Done");
    }
     static void printN(int n){
        if(n==6){
            return;
        }
        else{
            System.out.println(n);
            printN(n+1);
        }
    }
}
