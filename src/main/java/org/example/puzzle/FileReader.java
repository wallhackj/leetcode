package org.example.puzzle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private static final String PATH = "src/main/java/org/example/puzzle/input.txt";

    public static List<String> inputs() {
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
}
