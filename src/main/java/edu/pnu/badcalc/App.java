package edu.pnu.badcalc;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Calculator calculator = new Calculator();
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Bad Calculator v2.0");
        logger.info("Supported operations: + - * / and factorial (!)");
        logger.info("Type 'quit' to exit.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                logger.info("> "); // بدل System.out.print
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("quit")) {
                    logger.info("Exiting calculator...");
                    break;
                }

                try {
                    double result = calculator.parseAndCompute(input);
                    logger.info("= " + result); // بدل System.out.println
                } catch (IllegalArgumentException ex) {
                    logger.log(Level.WARNING, "Error: " + ex.getMessage());
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Unexpected error", ex);
                }
            }
        }
    }
}
