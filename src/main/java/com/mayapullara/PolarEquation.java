package com.mayapullara;

import java.util.Random;

public class PolarEquation {
    private int equationType;
    private int a, b, n;

    public static PolarEquation getRandomPolarEquation() {
        Random random = new Random();
        int equationType = random.nextInt(8);
        int a = random.nextInt(7) - 3;
        int b = random.nextInt(7) - 3;
        int n = random.nextInt(5) + 1;
        return new PolarEquation(equationType, a, b, n);
    }

    public PolarEquation(int equationType, int a, int b, int n) {
        this.equationType = equationType;
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public double getR(double theta) {
        switch (equationType) {
            case 1:
                return a + b * Math.sin(theta);
            case 2:
                return a * Math.cos(n * theta);
            case 3:
                return a * Math.sin(n * theta);
            case 4:
                return a;
            case 5:
                return n * theta;
            case 6:
                return Math.sqrt(Math.pow(a, 2) * Math.cos(2 * theta));
            case 7:
                return Math.sqrt(Math.pow(a, 2) * Math.sin(2 * theta));
            default:
                return a + b * Math.cos(theta);
        }
    }

    @Override
    public String toString() {
        switch (equationType) {
            case 0:
                return "r = " + a + " + " + b + " * cos(theta)";
            case 1:
                return "r = " + a + " + " + b + " * sin(theta)";
            case 2:
                return "r = " + a + " * cos(" + n + " * theta)";
            case 3:
                return "r = " + a + " * sin(" + n + " * theta)";
            case 4:
                return "r = " + a;
            case 5:
                return "r = " + n + " * theta";
            case 6:
                return "r^2 = " + a + "^2 * cos(2 * theta)";
            case 7:
                return "r^2 = " + a + "^2 * sin(2 * theta)";
            default:
                return "r = " + a + " + " + b + " * cos(theta)";
        }
    }
}
