package org.example.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumGeneticMutation {
    public static int minMutation(String startGene, String endGene, String[] bank) {
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        map.put(startGene, 0); q.offer(startGene); int steps; char[] c1,c2; String node;

        while (!q.isEmpty()) {
            node = q.poll();
            c1 = node.toCharArray();
            for (String gene : bank) {
                if (map.containsKey(gene)) continue;
                steps = 0;
                c2 = gene.toCharArray();
                for (int i = 0; i < 8; i++) {
                    if (c1[i] != c2[i]) steps++;
                }
                if (steps != 1) continue;
                map.put(gene, map.get(node) + 1);
                q.offer(gene);
            }
        }
        return map.getOrDefault(endGene, -1);
    }
}
