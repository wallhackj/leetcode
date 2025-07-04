package org.example.puzzle.aoc2015;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Arrays;

public class Puzzle4 {
    static String checksum = "ckczppom";

    static int compareByteArrays(byte[] a, byte[] b) {
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            int va = a[i] & 0xFF;
            int vb = b[i] & 0xFF;
            if (va != vb) {
                return Integer.compare(va, vb);
            }
        }
        return Integer.compare(a.length, b.length);
    }

    static boolean hashStartWithZeros(byte[] hash, int requiredNumberOfZeros) {
        int fullBytesToBeZero = requiredNumberOfZeros / 2;
        for (int i = 0; i < fullBytesToBeZero; i++) {
            if (hash[i] != 0) {
                return false;
            }
        }

        boolean nextHalfByteMustBeZero = requiredNumberOfZeros % 2 != 0;
        if (nextHalfByteMustBeZero) {
            return (hash[fullBytesToBeZero] | 0x0f) == 0x0f;
        }
        return true;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        long count = 0;
        byte[] compBytes = null;
        MessageDigest md = MessageDigest.getInstance("MD5");

        for (long i = 0; i < Long.MAX_VALUE; i++) {
            md.reset();
            md.update(checksum.getBytes(StandardCharsets.UTF_8));
            md.update(Long.toString(i).getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest();
            if (hashStartWithZeros(bytes, 6)) {
                if (compBytes == null || compareByteArrays(bytes, compBytes) < 0) {
                    compBytes = Arrays.copyOf(bytes, bytes.length);
                    count = i;
                    System.out.println(count);
                }
            }
        }
        System.out.println(count);
    }
}
