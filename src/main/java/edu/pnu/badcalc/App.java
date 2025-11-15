package edu.pnu.badcalc;
import java.util.Scanner;
import java.util.logging.Logger;
import edu.pnu.badcalc.Calculator;
public class App {
   private static final Logger logger = Logger.getLogger(App.class.getName());
   private static final Calculator c = new Calculator();
   private static final Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
       logger.info("Bad Calculator v0.0.1");
       while (true) {
           logger.info("> ");
           String line = s.nextLine();
           if (line.equals("quit"))
               break;
           try {
               logger.info("= " + c.parseAndCompute(line));
           } catch (Exception e) {
               logger.info("err");
           }
       }
   }
}