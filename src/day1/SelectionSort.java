package day1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static int[] SortArray(int arr[]) {

        int keyPosition = 0;
        int temp = 0;
     while (keyPosition < arr.length - 1) {
         //   for (int i = 0; i < arr.length - 1; i++) {
                for (int j = keyPosition+1; j < arr.length; j++) {
                    if (arr[keyPosition] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[keyPosition];
                        arr[keyPosition] = temp;
                    }
                }
                keyPosition++;
            }


       //}
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,40,50,20,60,30};
        System.out.println("Before Sorting : "+ Arrays.toString(arr)  );
        System.out.println("After Sorting :"+ Arrays.toString(SortArray(arr)));


    }
}
