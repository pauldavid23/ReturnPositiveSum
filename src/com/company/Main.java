package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of digits: ");

        if (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            scanner.nextLine();
            int[] printArray = getArray(count);
            System.out.println("The chosen arrays are " + Arrays.toString(printArray));
            System.out.println("The sum of all positive arrays are : " + sumPositiveArray(printArray));
        } else {
            System.out.println("Invalid input!");
        }
    }
    public static int [] getArray (int theLength) {
        int [] theLength2 = new int[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < theLength2.length; i++) {
            System.out.println("Enter array number " + theLength);
            theLength2[i]+= scanner.nextInt();
            scanner.nextLine();
            theLength--;
        }
        return theLength2;
    }
    public static int sumPositiveArray ( int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

}
