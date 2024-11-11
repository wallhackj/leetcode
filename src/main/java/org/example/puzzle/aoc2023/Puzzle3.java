package org.example.puzzle.aoc2023;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle3 {
    static final int MAX_RED = 12;
    static final int MAX_GREEN = 13;
    static final int MAX_BLUE = 14;

    public static void main(String[] args) {
        var games = inputs("input.txt");
        int sumOfPossibleGameIDs = 0;

        for (String game : games) {
            var split = game.split(":");
            var subsets = split[1].split(";");
            var isPossible = true;

            var gameId = Integer.parseInt(split[0].replace("Game ", "").trim());

            for (int i = subsets.length - 1; i >= 0; i--) {
                int red = 0, green = 0, blue = 0;
                var cubes = subsets[i].split(",");

                for (var cube : cubes) {
                    cube = cube.trim();
                    if (cube.endsWith("red")) {
                        red = Integer.parseInt(cube.split(" ")[0]);
                    } else if (cube.endsWith("green")) {
                        green = Integer.parseInt(cube.split(" ")[0]);
                    } else if (cube.endsWith("blue")) {
                        blue = Integer.parseInt(cube.split(" ")[0]);
                    }

                    if (red > MAX_RED || blue > MAX_BLUE || green > MAX_GREEN) {
                        isPossible = false;
                        break;
                    }
                }

                if (!isPossible) {
                    break;
                }
            }

            if (isPossible) {
                sumOfPossibleGameIDs += gameId;
            }
        }

        System.out.println("Sum of possible game IDs: " + sumOfPossibleGameIDs);
    }
}
