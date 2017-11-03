// Hackerrank: Dynamic Array Challenge.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {
    
    public static void main(String[] args) {
        int N, Q, lineNum = 0;
        int [][] sequences;
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer new Scanner(console.nextLine());
        
        // Read N and Q.
        // Not doing any checks here with hasNext() for now, assuming the input is OK.
        N = lineTokenizer.getInt(); 
        Q = lineTokenizer.getInt();
        
        
        while (console.hasNextLine()) {
            lineTokenizer = new Scanner(console.nextLine());
            
            if (lineNum < 1)
            // determine if the line has a name field
            if (lineTokenizer.hasNext()) {
	            lineTokenizer.next();  // consume the valid token
            }
            
            lineNum++;
        }


    }   
}