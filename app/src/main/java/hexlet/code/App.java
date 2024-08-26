package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class App {
    public static int answer;
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("""
                /Congratulations, Tirion!/
                /May I have your name?/
                Please enter the number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit\s""");

            System.out.print("Your choice: ");
            answer = input.nextInt();

            switch (answer) {

                case 1 -> Cli.greetings();
                case 2 -> Even.isEven();
                case 3 -> Calculator.mathGame();
                case 4 -> GCD.gcdGame();
                case 5 -> Progression.progressionGame();
                case 6 -> Prime.isPrimeGame();
            }
        }
    }
}



