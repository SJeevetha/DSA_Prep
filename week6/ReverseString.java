// As there are two methods on reversing a string.

/* NOTE: You cannot directly reverse a string in-place without extra space in Java because:
Strings are immutable in Java — meaning you cannot change them once created.
To modify characters, you'd have to convert to a mutable type like a char[] or use a StringBuilder.*/

// 1. Brute force approach (copying the characters of original into new string)
class Main {
    public static void main(String[] args) {
        String str = "Jeevetha";
        String copystr = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            copystr = copystr+ch;
        }
        str = copystr;
        System.out.print(str);
    }
}

// 2.Optimal Approach (using the character array)
class Main {
    public static void main(String[] args) {
        String str = "Jeevetha";
        char[] ch = str.toCharArray();  // Convert string to char array
        int i = 0, j = ch.length - 1;
        while (i < j) {
            // Swap characters
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        // Convert char array back to string
        String reversed = new String(ch);
        System.out.print(reversed);  // Output: ahteveeJ
    }
}


