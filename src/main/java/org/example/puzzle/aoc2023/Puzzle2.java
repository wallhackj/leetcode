package org.example.puzzle.aoc2023;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle2 {
    private static final Map<String, Integer> map = Map.of(
            "one", 1,
            "two", 2,
            "three", 3,
            "four", 4,
            "five", 5,
            "six", 6,
            "seven", 7,
            "eight", 8,
            "nine", 9
    );
    private static final Pattern WORD_PATTERN = Pattern.compile("one|two|three|four|five|six|seven|eight|nine");

    public static void main(String[] args) {
        var strings = inputs("input3.txt");
        var total = 0;

        for (String s : strings) {
            var firstDigit = findFirstDigit(s);
            var secondDigit = findSecondDigit(s);

            if (firstDigit != -1 && secondDigit != -1) {
                total += (firstDigit * 10) + secondDigit;
            }
        }

        System.out.println(total);
    }

    private static int findSecondDigit(String s) {
        for (int j = s.length() - 1; j >= 0; j--) {
            if (Character.isDigit(s.charAt(j))) {
                return Character.getNumericValue(s.charAt(j));
            }

            for (String word : map.keySet()) {
                var wordLength = word.length();
                if (j - wordLength + 1 >= 0 && s.substring(j - wordLength + 1, j + 1).equals(word)) {
                    return map.get(word);
                }
            }
        }
        return -1;
    }

    private static int findFirstDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                return Character.getNumericValue(ch);
            }

            Matcher matcher = WORD_PATTERN.matcher(s.substring(i));
            if (matcher.lookingAt()) {
                var word = matcher.group();
                return map.get(word);
            }
        }
        return -1;
    }
}
