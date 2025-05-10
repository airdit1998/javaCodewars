/*
Write a function that takes an array of numbers and returns the sum of the numbers.
The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.

 */


package kyu8;

import java.util.Arrays;

public class SumArrays {

    public static void main(String[] args) {
        double[] arr1 = new double[] {1.1, 2.2, 3.3};
        double[] arr2 = new double[] {};

        System.out.println(sum(arr2));
    }

    public static double sum(double[] numbers) {

        return Arrays.stream(numbers).sum();
    }

}
