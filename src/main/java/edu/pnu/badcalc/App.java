package edu.pnu.badcalc;

import java.util.Scanner;

public class App {

    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        System.out.println("Bad Calculator v2.0");
        System.out.println("Supported operations: + - * / and factorial (!)");
        System.out.println("Type 'quit' to exit.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting calculator...");
                    break;
                }

                try {
                    double result = calculator.parseAndCompute(input);
                    System.out.println("= " + result);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Error: " + ex.getMessage());
                } catch (Exception ex) {
                    System.out.println("Error: something went wrong");
                }
            }
        }
    }
}
