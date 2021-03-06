// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){


    }

    public static int[] getIntegers(int capacity){
        int[] inputNumbers = new int[capacity];
        // System.out.println("Enter your 5 numbers");
        for(int i = 0; i < inputNumbers.length; i++){
            inputNumbers[i] = scanner.nextInt();
        }
        return inputNumbers;
    }


    public static void printArray(int[] arrays){
        for(int i = arrays.length - 1; i >= 0; i--){
            System.out.println("Element " + i + " contents " + arrays[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        Arrays.sort(array);
        return array;
    }

}
