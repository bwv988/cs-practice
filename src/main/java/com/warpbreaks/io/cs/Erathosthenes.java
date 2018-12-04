package com.warpbreaks.io.cs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Erathosthenes {
    public static final int MAXPRIME = 100;


    public List<Integer> getPrimesNaive(int n) {
        // Generate a list of numbers from 2 up to n.
        List<Integer> nums = IntStream.range(2, n)
                .boxed()
                .collect(Collectors.toList());

        for(int i = 2; i * i < n; i++) {
            if(nums.get(i) != -1) {
                for (int j = i * i; j < n; j += i) {
                    nums.set(j - 2, -1);
                }
            }
        }

        // Filter numbers that have been struck out.
        List<Integer> res = nums.stream()
                .filter(x -> !(x == -1))
                .collect(Collectors.toList());

        return(res);
    }

    public static void main(String [] args) {
        Erathosthenes eS = new Erathosthenes();

        System.out.println(eS.getPrimesNaive(MAXPRIME));

    }


}
