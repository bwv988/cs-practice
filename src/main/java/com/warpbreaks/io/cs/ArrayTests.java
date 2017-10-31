//package com.warpbreaks.io.cs;

// A few tests with simple (double) arrays.
public class ArrayTests {

    public void print(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n");
    }

    // Find the maximum of an array.
    public double max(double[] myArray) {
        double max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        return max;
    }

    // Reverse the array. Naive approach.
    public double[] reverseNaive(double [] myArray) {
        int arrLength = myArray.length;
        double [] result = new double[arrLength];

        for(int i = arrLength - 1; i >= 0; i--) {
            // 5 4 3 2 1 0
            // want 0 1 2 3 4 5
            // 6 - 1 - (6 - 1) = 0
            // 6 - 1 - (6 - 2) = 1
            //...
            result[arrLength - 1 - i] = myArray[i];
        }
        return result;
    }

    // Reverse the array in place.
    public double[] reverseInplace(double [] myArray) {
        for(int i = 0; i < myArray.length / 2 ; i++) {
            double temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        return myArray;
    }

    public static void main(String[] args) {
        ArrayTests arrayTests = new ArrayTests();
        double [] t1 = {-2.3, 5.0, 1000.3, -12.12, 8};
        double [] t2 = {-2.3, 5.0, 1000.3, -12.12, 8, 9};

        // Run a few things.
        System.out.println("Array: \n");

        //arrayTests.print(new double[] {-2.3, 5.0, 1000.3, -12.12, 8});
        arrayTests.print(t1);

        System.out.println("Array maximum: " + arrayTests.max(t1));

        System.out.println("Array reversed (naive): \n");
        arrayTests.print(arrayTests.reverseNaive(t1));

        System.out.println("Array reversed (in-place): \n");
        arrayTests.print(arrayTests.reverseInplace(t1));

        System.out.println("Array reversed (naive): \n");
        arrayTests.print(arrayTests.reverseNaive(t2));

        System.out.println("Array reversed (in-place): \n");
        arrayTests.print(arrayTests.reverseInplace(t2));

    }

}