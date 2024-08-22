package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class App {
    public static int answer;
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("""
                Please enter the number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                """);
             answer = input.nextInt();

            switch (answer) {

                case 1 -> Cli.greetings();
                case 2 -> Even.isEven();
                case 3 -> Calculator.mathGame();
            }
        }
    }
}


