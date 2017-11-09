package com.warpbreaks.io.hackerrank;

import java.util.*;

public class Anagram {

    public static int numberNeeded(String first, String second) {
        int[] countFirst = new int[26];
        int[] countSecond = new int[26];

        // Get counts for first.
        for (int i = 0; i < first.length(); i++) {
            int idx = first.charAt(i) - 'a';
            countFirst[idx]++;
        }

        // Get counts for second.
        for (int i = 0; i < second.length(); i++) {
            int idx = second.charAt(i) - 'a';
            countSecond[idx]++;
        }

        // Compare.
        int diff = 0;

        for (int j = 0; j < 26; j++) {

            int d = Math.abs(countFirst[j] - countSecond[j]);
            if(d > 0) {
                diff += d;
            }
        }

        return(diff);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String a = in.next();
        // String b = in.next();
        // System.out.println(numberNeeded(a, b));
        //System.out.println(numberNeeded("cde", "abc"));
        System.out.println(numberNeeded("aab", "baaaaz"));
    }
}