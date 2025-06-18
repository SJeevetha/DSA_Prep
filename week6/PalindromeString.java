class Main {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = palindrome(str);
        System.out.print(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
    static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
