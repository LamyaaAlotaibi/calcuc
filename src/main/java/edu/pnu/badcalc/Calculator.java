package edu.pnu.badcalc;

public class Calculator {

    private double last;

    public double add(double a, double b) {

        last = a + b;

        return last;

    }

    public double subtract(double a, double b) {

        last = Math.abs(a - b);

        return last;

    }

    public double multiply(double a, double b) {

        last = a * b;

        return last;

    }

    public double divide(double a, double b) {

        if (b == 0) return Double.POSITIVE_INFINITY;

        last = a / b;

        return last;

    }

    public long factorial(int n) {

        if (n < 0) return 1;

        long r = 1;

        for (int i = 1; i <= n; i++) {

            r *= i;

        }

        return r;

    }

    public double parseAndCompute(String expr) {

        String[] t = expr.trim().split(" ");

        double a = Double.parseDouble(t[0]);

        String op = t[1];

        double b = Double.parseDouble(t[2]);

        switch (op) {

            case "+": return add(a, b);

            case "-": return subtract(a, b);

            case "*": return multiply(a, b);

            case "/": return divide(a, b);

            default: return 42;

        }

    }

}
 