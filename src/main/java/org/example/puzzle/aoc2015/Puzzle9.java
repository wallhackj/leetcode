package org.example.puzzle.aoc2015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle9 {
    static HashMap<String, HashMap<String, Integer>> destinations = new HashMap<>();
    static List<String> puzzle = inputs("aoc2015/inputs/in.txt");
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        for (String str : puzzle) {
            String[] s1 = str.split(" ");
            int d = Integer.parseInt(s1[4]);
            destinations.computeIfAbsent(s1[0], k -> new HashMap<>()).put(s1[2], d);
            destinations.computeIfAbsent(s1[2], k -> new HashMap<>()).put(s1[0], d);
        }
        for (String startCity : destinations.keySet()) {
            List<String> visited = new ArrayList<>();
            visited.add(startCity);
            fastPath(startCity, visited, 0);
        }

        System.out.println(maxSum);
    }

    private static void fastPath(String city, List<String> v, int sum) {
        if (v.size() == destinations.size()) {
            if (sum > maxSum) {
                maxSum = sum;
            }
            return;
        }
        for (String c : destinations.keySet()) {
            if (!v.contains(c)) {
                Integer d = destinations.get(city).get(c);
                if (d != null) {
                    int newSum = sum + d;
                    v.add(c);
                    fastPath(c, v, newSum);
                    v.remove(v.size() - 1);
                }
            }
        }
    }

}
