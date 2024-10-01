package org.example.puzzle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Puzzle1 {
    private static final String PATH = "src/main/java/org/example/puzzle/input.txt";

    private static List<String> inputs() {
        try (RandomAccessFile reader = new RandomAccessFile(PATH, "r")) {
            FileChannel channel = reader.getChannel();
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            int bufferSize = 1024;
            if (bufferSize > channel.size()) {
                bufferSize = (int) channel.size();
            }
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

            while (channel.read(buffer) > 0) {
                output.write(buffer.array(), 0, buffer.position());
                buffer.clear();
            }
            String content = output.toString(StandardCharsets.UTF_8);
            String[] lines = content.split("\\r?\\n");

            return new ArrayList<>(List.of(lines));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var strings = inputs();
//      var strings = List.of("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet");  //TEST CASE

        int total = 0;
        long startTime = System.currentTimeMillis();

        for (String line : strings) {
            int first = -1;
            int second = -1;


            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                // Check for digits
                if (Character.isDigit(c)) {
                    if (first == -1) {
                        first = c - '0';
                    }
                    second = c - '0';
                }
            }

            if (first != -1 && second != -1) {
                total += (first * 10) + second;
            }
        }


        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;


        System.out.println(total);
        System.out.println("Execution time: " + duration + " ms"); // 2-3 ms
    }
}
