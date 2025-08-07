package org.example.puzzle.aoc2015;

import java.util.ArrayList;
import java.util.List;

import static org.example.puzzle.FileReader.inputs;

public class Puzzle14 {
    public static void main(String[] args) {
        List<String> list = inputs("aoc2015/inputs/in.txt");
        int time = 2503;
        int max;

        List<Raindeer> herd = new ArrayList<>();
        for (String persons : list) {
            String[] split = persons.split(" ");
            String name = split[0];
            int v = Integer.parseInt(split[3]);
            int t = Integer.parseInt(split[6]);
            int r = Integer.parseInt(split[13]);
            herd.add(new Raindeer(name, t, v, r));
        }
        for (int i = 0; i < time; i++) {
            for (var rd : herd) {
                rd.tick();
            }

            int head = herd.stream()
                    .mapToInt(r -> r.distance)
                    .max()
                    .orElse(0);

            for (var rd : herd) {
                if (rd.distance == head) {
                    rd.score++;
                }
            }
        }

        max = herd.stream()
                .mapToInt(r -> r.score)
                .max()
                .orElse(0);

        System.out.println(max);
    }

    static class Raindeer {
        String name;
        int flyTime;
        int speed;
        int restTime;

        int distance;
        int score;

        boolean running = true;
        int stateTime;

        public Raindeer(String name, int flyTime, int speed, int restTime) {
            this.name = name;
            this.flyTime = flyTime;
            this.speed = speed;
            this.restTime = restTime;
            this.stateTime = flyTime;
        }

        void tick() {
            if (running) {
                distance += speed;
            }
            stateTime--;
            if (stateTime == 0) {
                running = !running;
                stateTime= running ? flyTime : restTime;
            }
        }
    }
}
