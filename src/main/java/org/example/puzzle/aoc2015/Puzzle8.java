package org.example.puzzle.aoc2015;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle8 {
    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/in.txt");
        int total = 0;
        int inMem = 0;

        for (String str : puzzle) {
            int n = str.length();
            total += n;
//            String s = str.substring(1, n - 1);
//            s = s.replaceAll("\\\\\"", "\"")
//                    .replaceAll("\\\\\\\\", "\\\\")
//                    .replaceAll("\\\\x[0-9a-fA-F]{2}", "#");
            str = str.replaceAll("\\\\", "\\\\\\\\")
                    .replaceAll("\"", "\\\\\"");
            String s = "\"" + str + "\"";
            inMem += s.length();
        }

        System.out.println(inMem - total);
    }
}
