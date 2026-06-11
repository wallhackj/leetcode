package org.example.puzzle.aoc2015;

import java.util.List;
import java.util.Map;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle16 {
    public static void main(String[] args) {
        List<String> list = inputs("aoc2015/inputs/in.txt");
        Map<String, Integer> map = Map.of(
                "children", 3,
                "cats", 7,
                "samoyeds", 2,
                "pomeranians", 3,
                "akitas", 0,
                "vizslas", 0,
                "goldfish", 5,
                "trees", 3,
                "cars", 2,
                "perfumes", 1
        );

        a1:
        for (String line : list) {
            String[] split = line.split("[,:]");
            //System.out.println(Arrays.toString(split));
            //[Sue 500,  cars,  1,  perfumes,  6,  vizslas,  1]
            // trees, cats > map, pomeranians, goldfish < map
            for (int i = 1; i < 7; i += 2) {
                String str = split[i].trim();
                int val = Integer.parseInt(split[i + 1].trim());
                int comp = map.get(str);
                if (str.equals("trees") || str.equals("cats")) {
                    if (val <= comp) continue a1;
                } else if (str.equals("pomeranians") || str.equals("goldfish")) {
                    if (val >= comp) continue a1;
                } else {
                    if (val != comp) continue a1;
                }
                if (i == 5) System.out.println(split[0]);
            }
        }
    }
}
