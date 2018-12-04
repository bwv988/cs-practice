package com.warpbreaks.io.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    // Very trivial implementation.
    // Should really consider using a Set.
    // Another improvement: Remove final loop by subtracting.
    static String checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for(String noteWord : note) {
            noteMap.put(noteWord, noteMap.getOrDefault(noteWord, 0) +  1);
        }

        for(String magWord : magazine) {
            magMap.put(magWord, magMap.getOrDefault(magWord, 0) + 1);
        }

        boolean ret = true;
        for(String key : noteMap.keySet()) {
            if(magMap.getOrDefault(key, 0) < noteMap.get(key)) {
                ret = false;
                break;
            }
        }

        if(ret) {
            return ("Yes");
        }
        else {
            return ("No");
        }
    }

    public static void main(String [] args) {
        //String [] magazine = {"give", "me", "one", "grand", "today", "night"};
        //String [] note = {"give", "one", "grand", "today"};


        //String [] magazine = {"give"};
        //String [] note = {"Give"};

        String [] magazine = {"give", "me", "one", "grand", "today", "night"};
        String [] note = {"give", "one", "thousand", "today"};

        System.out.println(checkMagazine(magazine, note));
    }
}
