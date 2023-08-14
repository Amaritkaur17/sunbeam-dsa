package day1;

import java.util.Scanner;

public class BinarySearch {
    public static int SearchBinaryKey(int arr[], int key){

        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (key == arr[mid])
                return mid;
            if (key > mid)
                left = mid + 1;
            if (key < mid)
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {11,22,33,44,55,66,77,88,99};
        int key = sc.nextInt();



    }
}
