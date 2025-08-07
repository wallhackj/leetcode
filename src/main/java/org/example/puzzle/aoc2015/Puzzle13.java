package org.example.puzzle.aoc2015;

import java.util.*;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle13 {
    static List<String> list = inputs("aoc2015/inputs/in.txt");
    private static final Map<String , Map<String, Integer>> map = new HashMap<>(list.size());
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        fillMap();
        Set<String> names = map.keySet();
        permute(new ArrayList<>(), new HashSet<>(), names);
        System.out.println(max);
    }

    private static void permute(List<String> curr, Set<String> fur, Set<String> names) {
        if (curr.size() == names.size()) {
            int score = calcHappines(curr);
            max = Math.max(score, max);
            return;
        }

        for (String person : names) {
            if (!fur.contains(person)) {
                curr.add(person);
                fur.add(person);
                permute(curr, fur, names);
                fur.remove(person);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private static int calcHappines(List<String> curr) {
        int total = 0;
        int n = curr.size();
        for (int i = 0; i < n; i++) {
            String left = curr.get(i);
            String right =curr.get((i + 1) % n);
            total += map.get(left).getOrDefault(right, 0);
            total += map.get(right).getOrDefault(left, 0);
        }
        return total;
    }


    private static void fillMap() {
        for (String str : list) {
            String[] split = str.replace('.', ' ')
                    .split(" ");
            int happ = Integer.parseInt(split[3]);
            if (split[2].equals("gain")) {
                map.computeIfAbsent(split[0], k -> new HashMap<>()).put(split[10], happ);
            } else map.computeIfAbsent(split[0], k -> new HashMap<>()).put(split[10], -happ);
        }
    }
}
