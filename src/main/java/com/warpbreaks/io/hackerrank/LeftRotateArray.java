// Hackerrank: Rotation challenge.
// Works.
// RS03112017


import java.util.*;

public class LeftRotateArray {
    
    public static int [] arrayLeftRotation(int [] a, int n, int d) {
        for (int j = 0; j < d; j ++) {
            
            int top = a[0];
            
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];            
            }
            
            a[n - 1] = top;
        }
        
        return a;
    }
    
    public static void main(String[] args) {
        int n, d = 0;
        int [] array;
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer = new Scanner(console.nextLine());

        n = lineTokenizer.nextInt();
        d = lineTokenizer.nextInt();
        array = new int[n];
        
        // Debug.
        System.out.println(n + ", " + d);
        
        lineTokenizer = new Scanner(console.nextLine());

        for(int i = 0; i < n; i++) {
            array[i] = lineTokenizer.nextInt();
        }
        
        
        // Debug.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        array = arrayLeftRotation(array, n, d);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
    }   
}