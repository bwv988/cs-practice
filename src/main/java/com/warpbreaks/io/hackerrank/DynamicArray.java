// Hackerrank: Dynamic Array Challenge.
// RS03112017


import java.util.*;

public class DynamicArray {
    
    public static void main(String[] args) {
        int N, Q, lastAnswer = 0;
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();

        Scanner console = new Scanner(System.in);
        Scanner lineTokenizer = new Scanner(console.nextLine());

        // Read N and Q.
        // Not doing any checks here with hasNext() for now, assuming the input is OK.
        N = lineTokenizer.nextInt();
        Q = lineTokenizer.nextInt();

        for(int i = 0; i < N; i++) {
            seqList.add(new ArrayList<Integer>());
        }

        // Can have at most Q inserts.
        for(int i = 0; i < Q; i++) {
            lineTokenizer = new Scanner(console.nextLine());

            int queryType = lineTokenizer.nextInt();
            int x = lineTokenizer.nextInt();
            int y = lineTokenizer.nextInt();
            int seq = (x ^ lastAnswer) % N;
            ArrayList<Integer> sequence = seqList.get(seq);

            if (queryType == 1) {
                sequence.add(y);
            } else if (queryType == 2) {
                lastAnswer = sequence.get(y % sequence.size());
                System.out.println(lastAnswer);
            }
        }
        
        // Debug.
        //for (ArrayList<Integer> sList: seqList) {
        //System.out.println(sList);
        //}
    }   
}