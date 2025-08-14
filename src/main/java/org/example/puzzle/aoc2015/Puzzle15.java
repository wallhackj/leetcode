package org.example.puzzle.aoc2015;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle15 {
    public static void main(String[] args) {
        List<String> list = inputs("aoc2015/inputs/in.txt");
        Pattern pattern = Pattern.compile("capacity (-?\\d+), durability (-?\\d+), flavor (-?\\d+), texture (-?\\d+), calories (-?\\d+)");

        int n = list.size();
        int[] capacity = new int[4];
        int[] durability = new int[4];
        int[] flavor = new int[4];
        int[] texture = new int[4];
        int[] calories = new int[4];

        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            if (matcher.find()) {
                capacity[i] = Integer.parseInt(matcher.group(1));
                durability[i] = Integer.parseInt(matcher.group(2));
                flavor[i] = Integer.parseInt(matcher.group(3));
                texture[i] = Integer.parseInt(matcher.group(4));
                calories[i] = Integer.parseInt(matcher.group(5));
            }
        }

        System.out.println(maxScore(capacity, durability, flavor, texture, calories));
    }

    private static int maxScore(int[] cap, int[] dur, int[] fla, int[] tex, int[] cal) {
        int a, b, c, d, e;
        int max_score = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101 - i; j++) {
                for (int k = 0; k < 101 - i - j; k++) {
                    int s = 100 - i - j - k;
                    a = Math.max(0, cap[0] * i + cap[1] * j + cap[2] * k + cap[3] * s);
                    b = Math.max(0, dur[0] * i + dur[1] * j + dur[2] * k + dur[3] * s);
                    c = Math.max(0, fla[0] * i + fla[1] * j + fla[2] * k + fla[3] * s);
                    d = Math.max(0, tex[0] * i + tex[1] * j + tex[2] * k + tex[3] * s);
                    e = Math.max(0, cal[0] * i + cal[1] * j + cal[2] * k + cal[3] * s);
                    int score = a * b * c * d;
                    if (e <= 500) {
                        max_score = Math.max(score, max_score);
                    } else break;
                }
            }
        }
        return max_score;
    }

}
