// Hackerrank: Dynamic Array Challenge.
// RS03112017

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {
    
    public static void main(String[] args) {
        int N, Q, lastAnswer = 0;
        List<List<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
        
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer = new Scanner(console.nextLine());
        
        // Read N and Q.
        // Not doing any checks here with hasNext() for now, assuming the input is OK.
        N = lineTokenizer.nextInt(); 
        Q = lineTokenizer.nextInt();
        
        //System.out.println("Dimensions: " + N + ", " + Q);
        
        // Can have at most Q inserts.
        
        for(int i = 0; i < Q; i++) {
            lineTokenizer = new Scanner(console.nextLine());
            
            int queryType = lineTokenizer.nextInt();
            int x = lineTokenizer.nextInt();
            int y = lineTokenizer.nextInt();
            
            if (queryType == 1) {
                int seqNum = (x ^ lastAnswer) % N;
                System.out.println("seqNum = " + seqNum);
                if(seqList.get(seqNum) == null) {
                    seqList.get(seqNum) = new ArrayList<Integer>();
                }
                
                seqList.get(seqNum).append(y);
                
            } else if (queryType == 2) {
                
            }
            
            //System.out.println(queryType + " " + x + " " + y);
        }
        
        // Debug.
        for (List<Integer> l: seqList) {
            System.out.print(l + ": ");
            for (int j: seqList.get(l)) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }   
}