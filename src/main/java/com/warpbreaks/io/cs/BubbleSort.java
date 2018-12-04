// Filthy implementation of Bubblesort.
// Not pretty ;)

package com.warpbreaks.io.cs;

public class BubbleSort {
   
    /*
        Swap values of ar[idx1] with ar[idx2].
    */
    private static int[] swap(int[] ar, int idx1, int idx2) {
        int temp = ar[idx1];
        ar[idx1] = ar[idx2];
        ar[idx2] = temp;

        return(ar);
    }

    private static int[] bubbleSort(int[] ar) {
        boolean swaps = true;

        while(swaps) {
            swaps = false;
            for(int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    ar = swap(ar, i, i + 1);
                    printArray(ar);
                    swaps = true;
                }
            }   
        }

        return(ar);
    }

    private static void printArray(int[] ar) {
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String [] args) {
        int[] array = new int[]{5, 1, 4, 2, 8};
        
        printArray(array);
       
        int[] sorted = bubbleSort(array);

        printArray(sorted);
    }
}