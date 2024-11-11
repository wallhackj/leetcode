package org.example.puzzle.aoc2023;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle1 {
    public static void main(String[] args) {
        var strings = inputs("input1.txt");
//      var strings = List.of("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet");  //TEST CASE

        int total = 0;
        long startTime = System.currentTimeMillis();

        for (String line : strings) {
            int first = -1;
            int second = -1;


            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                // Check for digits
                if (Character.isDigit(c)) {
                    if (first == -1) {
                        first = c - '0';
                    }
                    second = c - '0';
                }
            }

            if (first != -1 && second != -1) {
                total += (first * 10) + second;
            }
        }


        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;


        System.out.println(total);
        System.out.println("Execution time: " + duration + " ms"); // 2-3 ms
    }
}
