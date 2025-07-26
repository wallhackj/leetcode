package org.example.puzzle.aoc2015;

import java.util.HashSet;

public class Puzzle11 {
    public static void main(String[] args) {
        var puzzle = "hepxxyzz";
        char[] arr = puzzle.toCharArray();

        while (true) {
            inc(arr);
            if (isValid(arr)) {
                System.out.println(new String(arr));
                break;
            }
        }
    }

    private static void inc(char[] arr) {
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] == 'z') {
                arr[i] = 'a';
                i--;
            } else {
                arr[i]++;
                break;
            }
        }
    }

    private static boolean isValid(char[] arr) {
        boolean tw = false, dd, iol = true;
        int n = arr.length;
        String pair;
        HashSet<String> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'l') {
                iol = false;
            }
            if (i + 2 < n && arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
                tw = true;
            }
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                pair = "" + arr[i] + arr[i + 1];
                map.add(pair);
            }

        }
        dd = map.size() >= 2;
        return tw && dd && iol;
    }
}
