package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How much numbers?");
        int arrayLength = sc.nextInt();
        int[] intArray = new int[arrayLength];
        int count = 0;

        System.out.println("Enter " + arrayLength + " numbers");


        for (int i = 0; i < arrayLength; i++) {
            if (count >= arrayLength) {
                break;
            } else {
                System.out.println(" Enter number: " + (i + 1));
                int number = sc.nextInt();
                intArray[i] = number;
                count++;

            }
        }

        System.out.println(Arrays.toString(sortedArray(intArray)));

        sortedArrayWithSorted(intArray);

    }


    public static void sortedArrayWithSorted(int[] array) {
        System.out.println(Arrays.stream(array).sorted());
    }

    public static int[] sortedArray(int[] array) {
        boolean flag = true;

        while (flag) {
            int temp;
            flag = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] <= array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
