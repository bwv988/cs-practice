// Hackerrank: Dynamic Array Challenge.
// RS03112017


import java.util.*;

public class DynamicArray {
    
    public static void main(String[] args) {
        int N, Q, lastAnswer = 0;
        int [][] seqList;
        int [] lastQ;
        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer = new Scanner(console.nextLine());

        // Read N and Q.
        // Not doing any checks here with hasNext() for now, assuming the input is OK.
        N = lineTokenizer.nextInt();
        Q = lineTokenizer.nextInt();

        // Can have at most Q inserts.
        seqList = new int[N][Q];
        lastQ = new int[Q];

        for(int i = 0; i < Q; i++) {
            lineTokenizer = new Scanner(console.nextLine());

            int queryType = lineTokenizer.nextInt();
            int x = lineTokenizer.nextInt();
            int y = lineTokenizer.nextInt();
            int seq = (x ^ lastAnswer) % N;
            int [] sequence = seqList[seq];

            if (queryType == 1) {
                System.out.println("Sequence: " + seq);
                System.out.println("lastQ for this sequence: " + lastQ[seq]);

                sequence[lastQ[seq]] = y;
                lastQ[seq]++;
            } else if (queryType == 2) {
                System.out.println("y: " + y);
                System.out.println("lastAnswer index: " + y % sequence.length);

                lastAnswer = sequence[y % sequence.length];
                System.out.println(lastAnswer);
            }
        }
        
        // Debug.
        //for (ArrayList<Integer> sList: seqList) {
        //System.out.println(sList);
        //}
    }   
}