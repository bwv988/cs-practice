// Some Tests from the Sedgewick book.
// Not meant to showcase Java and OO best practices! ;)
// RS31102017

import java.util.Random;

public class MiscTest {

        
    public void q1() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
    
        System.out.println(sum);
    }
    
    // Convert a number into binary string representation.
    public void q2() {
         int N = 11;
         int d = N;
         String binaryRep = new String();
         
         while(d != 0) {
             int r = d % 2;
             d = d / 2;
             binaryRep += Integer.toString(r);
         }
         
         System.out.println(binaryRep);
         
    }
    
    // 2d random boolean array print-out.
    public void q3(int dim) {
        boolean[][] boolArray = new boolean[dim][dim];
        Random rnd = new Random();
        
        System.out.print(" ");
        
        // Initialize array.
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (rnd.nextInt(10) < 5) {
                    boolArray[i][j] = false;
                } else {
                    boolArray[i][j] = true;
                }
            }
        }
        
        // FIXME: Will not work so well with >=2 digit dimensions.
        for(int j = 0; j < dim; j++) {
            System.out.print(" " + j);
        }
        
        System.out.println("");
       
        
        // Print array & row indices.
        for (int i = 0; i < dim; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < dim; j++) {
                if (boolArray[i][j] == false) {
                    System.out.print("x ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
    
    public void runtimeAnalysis(int N) {
        long startTime = System.currentTimeMillis();
        
        int i, j, k, count = 0; 
        for (i = 0; i < N; i++) 
          for (j = 0; j < N; j++) 
            for (k = 0; k < N; k++) 
              count++;

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        
        System.out.println("Elapsed time: " + elapsedTime + " ms");    
    }
    
    public static void main(String[] args) {
        MiscTest obj = new MiscTest();
        
        //obj.q1();
        //obj.q2();
        //obj.q3(9);
        
        obj.runtimeAnalysis(10);
        obj.runtimeAnalysis(100);
        obj.runtimeAnalysis(1000);
    }   
}