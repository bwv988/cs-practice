package com.warpbreaks.io.cs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EratosthenesStreams {

    public void getPrimes(int p) {
        // Generate the list of numbers up to p.
        List<Integer> nums = IntStream.range(2, p).boxed().collect(Collectors.toList());

        for(int i = 2; i < p; i++) {
            int m = 2;

            while(i * m < (nums.size() - 1)) {
                System.out.println(i * m);

                nums.set(i * m, -1);

                m++;

            }
        }

        System.out.println(nums);
    }



    public static void main(String []args) {

        EratosthenesStreams eS = new EratosthenesStreams();

        eS.getPrimes(10);

    }


}
