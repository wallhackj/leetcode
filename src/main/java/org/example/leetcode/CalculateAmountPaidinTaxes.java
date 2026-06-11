package org.example.leetcode;

class CalculateAmountPaidinTaxes {
    public static double calculateTax(int[][] brackets, int income) {
        double result = 0.0d;
        int upp0 = 0;

        for (int[] i : brackets) {
            int upp1 = i[0];
            int tax = Math.max(0, Math.min(income, upp1) - upp0);
            result += tax * i[1];
            upp0 = upp1;
        }
	   return result / 100;
    }
} 
