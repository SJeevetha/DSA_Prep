// if n=4
/* 1 2 3 4
   1 2 3 4
   1 2 3 4
   1 2 3 4 */
class Pattern2 {
    public static void main(String[] args) {
        int n=15;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
             System.out.println("");
        }
    }
}
