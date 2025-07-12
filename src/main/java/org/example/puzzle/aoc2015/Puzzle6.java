package org.example.puzzle.aoc2015;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.max;
import static org.example.puzzle.FileReader.inputs;

public class Puzzle6 {
    public static void main(String[] args) {
        var puzzle = inputs("aoc2015/inputs/in6.txt");
        Pattern pattern = Pattern.compile("\\b(turn on|turn off|toggle)\\b", Pattern.CASE_INSENSITIVE);
        int[][] lights = new int[1000][1000];

        for (String str : puzzle) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                Matcher m = extract(str);
                if (m != null) {
                    String[] spl1 = m.group(1).trim().split(",");
                    String[] spl2 = m.group(2).trim().split(",");

                    int x1 = Integer.parseInt(spl1[0]);
                    int y1 = Integer.parseInt(spl1[1]);
                    int x2 = Integer.parseInt(spl2[0]);
                    int y2 = Integer.parseInt(spl2[1]);

                    for (int i = x1; i <= x2; i++) {
                        for (int j = y1; j <= y2; j++) {
                            if (matcher.group().equalsIgnoreCase("turn on")) {
                                lights[i][j] += 1;
                            } else if (matcher.group().equalsIgnoreCase("turn off")) {
                                lights[i][j] = max(0, lights[i][j] - 1);
                            } else {
                                lights[i][j] += 2;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.stream(lights).flatMapToInt(Arrays::stream).sum());

//        int[] arr = {2, 4, 1, 33, 20};
//        quicksort(arr, 0, arr.length -1);
//        System.out.println(Arrays.toString(arr));

    }

//    public static int countTrue(int[][] lights) {
//        int count = 0;
//        for (int[] light : lights) {
//            for (int b : light) {
//                if (b) {
//                    count++;
//                }
//            }
//        }
//        return count;
//        Arrays.stream(lights).mapToInt(Integer::intValue).sum();
//    }

    private static Matcher extract(String str) {
        Matcher matcher = Pattern
                .compile(".*?(\\d+,\\d+).*?(\\d+,\\d+)")
                .matcher(str);
        if (matcher.find()) {
            return matcher;
        }
        return null;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
