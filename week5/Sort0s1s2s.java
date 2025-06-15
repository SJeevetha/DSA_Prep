//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

/*Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int zero = 0, one = 0, two = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0)
                zero++;
            else if(arr[i] == 1)
                one++;
            else if(arr[i] == 2)
                two++;
        }

        int[] sort = new int[n];
        int index = 0;

        for(int i = 0; i < zero; i++)
            sort[index++] = 0;
        for(int i = 0; i < one; i++)
            sort[index++] = 1;
        for(int i = 0; i < two; i++)
            sort[index++] = 2;

        for(int i = 0; i < n; i++)
            System.out.print(sort[i] + " ");
    }
}
