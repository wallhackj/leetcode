package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
        /*
         * Complete the 'divided' function below.
         *
         * The function is expected to return a LONG_INTEGER_ARRAY.
         * The function accepts 2D_LONG_INTEGER_ARRAY arr as parameter.
         */

        public static List<Long> divided(List<List<Long>> arr) {
            // Write your code here
            long topLeftSum = 0;
            long topRightSum = 0;
            long bottomLeftSum = 0;
            long bottomRightSum = 0;

            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.get(i).size(); j++) {
                    // Exclude diagonal elements
                    if (i != j && i != (arr.get(i).size() - 1 - j)) {
                        if (i < arr.size() / 2) { // Top half
                            if (j < arr.get(i).size() / 2) { // Left half
                                topLeftSum += arr.get(i).get(j);
                            } else { // Right half
                                topRightSum += arr.get(i).get(j);
                            }
                        } else { // Bottom half
                            if (j < arr.get(i).size() / 2) { // Left half
                                bottomLeftSum += arr.get(i).get(j);
                            } else { // Right half
                                bottomRightSum += arr.get(i).get(j);
                            }
                        }
                    }
                }
            }

            List<Long> result = new ArrayList<>();
            result.add(topLeftSum);
            result.add(topRightSum);
            result.add(bottomLeftSum);
            result.add(bottomRightSum);

            return result;
        }


}
