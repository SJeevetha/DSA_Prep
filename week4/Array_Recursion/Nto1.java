// Print numbers from N to 1

class Main {
    public static void main(String[] args) {
       printN(5);
       System.out.println("Done");
    }
     static void printN(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            printN(n-1);
        }
    }
}
