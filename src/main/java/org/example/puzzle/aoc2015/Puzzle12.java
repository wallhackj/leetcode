package org.example.puzzle.aoc2015;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle12 {
    public static void main(String[] args) throws JsonProcessingException {
        String arr = inputs("aoc2015/inputs/in.txt").get(0);
        long s;

//        String[] split = arr
//                .replaceAll("[^0-9+-]", " ")
//                .split(" ");
//        for (String str : split) {
//            if (!str.isBlank()) {
//                s += Long.parseLong(str);
//            }
//        }

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(arr);
        s = compute(root);
        System.out.println(s);
    }

    private static long compute(JsonNode node) {
        long sum;
        if (node.isNumber()) {
            return node.asLong();
        } else if (node.isArray()) {
            sum = 0;
            for (JsonNode n : node) {
                sum += compute(n);
            }
            return sum;
        } else if (node.isObject()) {
            sum = 0;
            for (JsonNode n : node) {
                if (n.isTextual() && n.asText().equals("red")) {
                    return 0;
                } else {
                    sum += compute(n);
                }
            }
            return sum;
        }
        return 0;
    }
}
