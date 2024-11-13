package org.example.puzzle.aoc2015;

import static java.lang.Math.min;
import static org.example.puzzle.FileReader.inputs;

public class Puzzle3 {
    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/input3.txt");
        int result = 0;

        for (var line : puzzle) {
            var sp = line.split("x");
            int l = Integer.parseInt(sp[0]);
            int w = Integer.parseInt(sp[1]);
            int h = Integer.parseInt(sp[2]);

            var lw = l * w;
            var wh = w * h;
            var hl = h * l;

            result += (2 * lw + 2 * wh + 2 * hl) + min(min(lw, wh), hl);
        }

        System.out.println(result);
    }
}
