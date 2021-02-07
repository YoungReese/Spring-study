package com.ly.soundsystem;


public class CalculateFee {

    private static boolean changed = true;
    private static int[] basedFee = new int[12];

    public static void main(String[] args) {
        calculateFee(60001);
    }

    private static int calculateFee(int order) {
        if (changed) {
            calculateBasedFee();
        }
        int total = 0;
        if (order <= 5) {
            total = basedFee[0] + order * 30;
        } else if (order <= 20) {
            total = basedFee[1] + (order - 5) * 15;
        } else if (order <= 50) {
            total = basedFee[2] + (order - 20) * 10;
        } else if (order <= 100) {
            total = basedFee[3] + (order - 50) * 9;
        } else if (order <= 500) {
            total = basedFee[4] + (order - 100) * 8;
        } else if (order <= 1000) {
            total = basedFee[5] + (order - 500) * 7;
        } else if (order <= 2000) {
            total = basedFee[6] + (order - 1000) * 6;
        } else if (order <= 3000) {
            total = basedFee[7] + (order - 2000) * 5;
        } else if (order <= 4000) {
            total = basedFee[8] + (order - 3000) * 4;
        } else if (order <= 5000) {
            total = basedFee[9] + (order - 4000) * 3;
        } else if (order <= 6000) {
            total = basedFee[10] + (order - 5000) * 2;
        } else {
            total = basedFee[11] + (order - 6000) * 1;
        }
        return total;
    }

    private static void calculateBasedFee() {
        basedFee[0] = 0;
        basedFee[1] += basedFee[0] + (5 - 0) * 30;
        basedFee[2] += basedFee[1] + (20 - 5) * 15;
        basedFee[3] += basedFee[2] + (50 - 20) * 10;
        basedFee[4] += basedFee[3] + (100 - 50) * 9;
        basedFee[5] += basedFee[4] + (500 - 100) * 8;
        basedFee[6] += basedFee[5] +  (1000 - 500) * 7;
        basedFee[7] += basedFee[6] +  (2000 - 1000) * 6;
        basedFee[8] += basedFee[7] +  (3000 - 2000) * 5;
        basedFee[9] += basedFee[8] +  (4000 - 3000) * 4;
        basedFee[10] += basedFee[9] +  (5000 - 4000) * 3;
        basedFee[11] += basedFee[10] +  (6000 - 5000) * 2;
        changed = false;
    }

}
