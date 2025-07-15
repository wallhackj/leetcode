package org.example.puzzle.aoc2015;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle7 {
    private static final Map<String, String> map = new HashMap<>();
    private static final Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/in.txt");
        cache.put("b", 3176);

        for (String str : puzzle) {
            Matcher mainMatcher = Pattern.compile("^(.+) -> (\\w+)$").matcher(str);
            if (mainMatcher.find()) {
                map.put(mainMatcher.group(2), mainMatcher.group(1));
            }
        }
        System.out.println(getValue("a"));
    }

    private static Integer getValue(String wire) {
        if (cache.containsKey(wire)) return cache.get(wire);

        if (wire.matches("\\d+")) {
            return Integer.parseInt(wire);
        }
        String exp = map.get(wire);
        if (exp == null) throw new RuntimeException("No instruction for: " + wire);

        if (exp.contains("AND")) {
            String[] s1 = exp.split(" AND ");
            int res = getValue(s1[0]) & getValue(s1[1]);
            cache.put(wire, res);
            return res;
        } else if (exp.contains("OR")) {
            String[] s2 = exp.split(" OR ");
            int res = getValue(s2[0]) | getValue(s2[1]);
            cache.put(wire, res);
            return res;
        } else if (exp.contains("RSHIFT")) {
            String[] s2 = exp.split(" RSHIFT ");
            int res = getValue(s2[0]) >> getValue(s2[1]);
            cache.put(wire, res);
            return res;
        } else if (exp.contains("LSHIFT")) {
            String[] s2 = exp.split(" LSHIFT ");
            int res = getValue(s2[0]) << getValue(s2[1]);
            cache.put(wire, res);
            return res;
        } else if (exp.contains("NOT")) {
            String substring = exp.substring(4);
            int res = ~getValue(substring) & 0xFFFF;
            cache.put(wire, res);
            return res;
        } else {
            int res = getValue(exp);
            cache.put(wire, res);
            return res;
        }
    }
}
