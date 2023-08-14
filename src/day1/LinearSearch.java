package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {

    public static int SearchKey(int arr[], int key){

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i]== key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {88,33,67,99,11,22,77,55,44};
        System.out.println("Enter the key to be searched : ");
        int key = sc.nextInt();
        int index = SearchKey(arr, key);
        if(index != -1)
            System.out.println("Key found at index "+index);
        else
        System.out.println("Key not found");

        sc.close();


    }
}
