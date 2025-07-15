package org.example.puzzle.aoc2015;

import static java.lang.Math.*;
import static org.example.puzzle.FileReader.inputs;


public class Puzzle3 {
    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/in.txt");
        int result = 0;

        for (var line : puzzle) {
            var sp = line.split("x");
            int l = Integer.parseInt(sp[0]);
            int w = Integer.parseInt(sp[1]);
            int h = Integer.parseInt(sp[2]);

            int bow = 2 * (l + w + h - max(l, max(w, h)));
            result += bow + (l * w * h);
        }

        System.out.println(result);
    }
}
