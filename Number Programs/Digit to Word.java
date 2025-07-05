// Enter number=1234
// Digit=1234
// Words=One Two Three Four 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words="";
        int digit = sc.nextInt();
        int num=digit;
        while(num>0){
            int r = num%10;
            switch(r){
                case 0:
                    words = "Zero " + words;
                    break;
                case 1:
                    words = "One " + words;
                    break;
                case 2:
                    words = "Two " + words;
                    break;
                case 3:
                    words = "Three " + words;
                    break;
                case 4:
                    words = "Four " + words;
                    break;
                case 5:
                    words = "Five " + words;
                    break;
                case 6:
                    words = "Six " + words;
                    break;  
                case 7:
                    words = "Seven " + words;
                    break;
                case 8:
                    words = "Eight " + words;
                    break;
                case 9:
                    words = "Nine " + words;
                    break;    
            }
            num = num/10;
        }
        System.out.println(words);
    }
}
