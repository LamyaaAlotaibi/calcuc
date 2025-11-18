package edu.pnu.badcalc;

public class Calculator {

    private double lastResult = 0;

    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        lastResult = a / b;
        return lastResult;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is undefined");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        lastResult = result;
        return result;
    }

    public double parseAndCompute(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression is empty");
        }

        expression = expression.trim();

        if (expression.endsWith("!")) {
            String numStr = expression.substring(0, expression.length() - 1).trim();
            int n = (int)parseNumber(numStr);
            return factorial(n);
        }

        String[] tokens = expression.split("\\s+");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Expression must be in the form: a op b");
        }

        double a = parseNumber(tokens[0]);
        double b = parseNumber(tokens[2]);
        String op = tokens[1];

        return switch (op) {
            case "+" -> add(a, b);
            case "-" -> subtract(a, b);
            case "*" -> multiply(a, b);
            case "/" -> divide(a, b);
            default -> throw new IllegalArgumentException("Unsupported operator: " + op);
        };
    }

    private double parseNumber(String str) {
        str = str.trim();
        if (str.equalsIgnoreCase("last")) {
            return lastResult;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid number: " + str);
        }
    }

    public double getLastResult() {
        return lastResult;
    }
}
