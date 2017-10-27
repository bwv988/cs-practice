package com.warpbreaks.io.cs;

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

    public static void main(String[] args) {
        ArrayTests arrayTests = new ArrayTests();
        double [] t1 = {-2.3, 5.0, 1000.3, -12.12, 8};

        // Run a few things.
        System.out.println("Array: \n");

        //arrayTests.print(new double[] {-2.3, 5.0, 1000.3, -12.12, 8});
        arrayTests.print(t1);

        System.out.println("Array maximum: " + arrayTests.max(t1));


    }

}