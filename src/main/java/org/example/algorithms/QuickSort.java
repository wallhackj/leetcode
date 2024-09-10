package org.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(List.of(1, 23, 42, 21, 2, 4, 55, 10)));
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return arr;
        }

        int pivot = (arr.size() - 1) / 2;
        var leftArray = new ArrayList<Integer>();
        var rightArray = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            if (pivot == i) {
                continue;
            }

            int current = arr.get(i);

            if (current >= arr.get(pivot)) {
                rightArray.add(current);
            } else {
                leftArray.add(current);
            }
        }

        var sortedLeftArray = quickSort(leftArray);
        var sortedRightArray = quickSort(rightArray);

        var array = new ArrayList<>(sortedLeftArray);
        array.add(arr.get(pivot));
        array.addAll(sortedRightArray);

        return array;
    }
}
