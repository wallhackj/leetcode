package org.example.puzzle.aoc2015;


import java.util.HashMap;
import java.util.Map;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle5 {
    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/in.txt");
        boolean dd, xy;
        int count = 0;
        char[] arr;
        Map<String, Integer> map;

        for (String str : puzzle) {
            dd = false;
            xy = false;
            arr = str.toCharArray();
            map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                String pair;
                if (i < arr.length - 1) {
                    pair = "" + arr[i] + arr[i + 1];
                    if (map.containsKey(pair)) {
                        if (i - map.get(pair) >= 2) {
                            xy = true;
                        }
                    } else {
                        map.put(pair, i);
                    }
                }
                if (i < arr.length - 2 && arr[i] == arr[i + 2]) {
                    dd = true;
                }
            }
            if (dd && xy) {
                count++;
            }
        }

        System.out.println(count);
    }
}
