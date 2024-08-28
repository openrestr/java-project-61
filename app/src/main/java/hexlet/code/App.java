package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        String answer;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("""
                Please enter the number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit\s""");

            System.out.print("Your choice: ");
            answer = input.next();

            switch (answer) {

                case "1" -> Cli.greetings();
                case "2" -> Even.isEven();
                case "3" -> Calculator.mathGame();
                case "4" -> GCD.gcdGame();
                case "5" -> Progression.progressionGame();
                case "6" -> Prime.isPrimeGame();
                case "0" -> System.out.println("Bye!");
                default -> System.out.println("There is no choice from answer.");
            }
        }
    }
}



