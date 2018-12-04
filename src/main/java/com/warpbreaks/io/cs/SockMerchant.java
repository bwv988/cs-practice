// Not sure where I found this puzzle on. I think Geeksforgeeks.com.
// The question was how many pairs of socks of identical color can be formed.

package com.warpbreaks.io.cs;

import java.util.*;

public class SockMerchant {
    static List<Integer> socks = new ArrayList<Integer>();

    static {
        //socks.add(1);
        //socks.add(2);
        //socks.add(1);
        //socks.add(2);
        //socks.add(1);
        //socks.add(3);    
        //socks.add(2);
        socks.add(10);
        socks.add(20);
        socks.add(20);        
        socks.add(10);
        socks.add(10);
        socks.add(30);
        socks.add(50);
        socks.add(10);
        socks.add(20);
    }
    

    public static void main(String [] args) {
        Map<Integer, Integer> socksByColor = new HashMap<Integer, Integer>();

        for(int s : socks) {
            socksByColor.put(s, socksByColor.getOrDefault(s, 0) + 1);          
        }

        int total = 0;
        for (Map.Entry<Integer, Integer> entry : socksByColor.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            total += entry.getValue() / 2;            
		}
         
        System.out.println(total);
    }
}