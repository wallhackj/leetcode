package org.example.puzzle.aoc2015;

public class Puzzle10 {
    static String puzzle = "1321131112";

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            StringBuilder sb = new StringBuilder();
            int k = 0;
            while (k < puzzle.length()) {
                int count = 1;
                char currentChar = puzzle.charAt(k);
                while (k + 1 < puzzle.length() && puzzle.charAt(k) == puzzle.charAt(k + 1)) {
                    count++;
                    k++;
                }
                sb.append(count).append(currentChar);
                k++;
            }
            puzzle = sb.toString();
        }
        System.out.println(puzzle.length());
    }

}
