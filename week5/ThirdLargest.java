// https://www.geeksforgeeks.org/problems/third-largest-element/1

//1. Solved using the sorting(insertion) but it takes more time and space complexity
class Solution {
    int thirdLargest(int arr[]) {
        // Insertion Sort (Descending Order)
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < key) { // descending order
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Return the third largest element
        return arr[2]; // Since sorted descending
    }
}

// 2. without using any sorting algorithm takes less time and space complexity
class Solution {
    int thirdLargest(int arr[]) {
        if(arr.length<3)
          return -1;
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>=first){
                third = second;
                second=first;
                first=num;
            }
            else if(num>=second && num<first){
                third = second;
                second=num;
            }
            else if(num>=third && num<second && num<first)
             third = num;
        }
        return third;
    }
}
