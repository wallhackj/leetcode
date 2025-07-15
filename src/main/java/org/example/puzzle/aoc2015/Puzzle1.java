package org.example.puzzle.aoc2015;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle1 {
    public static void main(String[] args) {
        var puzzle = inputs("in.txt").get(0);
        var count = 0;

        for (int i = 0; i < puzzle.length(); i++) {
            if (puzzle.charAt(i) == '(') {
                count++;
            }else {
                count--;
            }
        }
        System.out.println(count);
    }
}
