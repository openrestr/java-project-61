package hexlet.code;

import java.util.Scanner;

public class Calculator {
    public static void  mathGame() {
        Cli.greetings();

        int countRightAnswer = 0;
        int currentNumber1;
        int currentNumber2;
        int correctAnswer = 0;

        Scanner answer = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        while (countRightAnswer < 3) {

            int generator = (int) (Math.random() * 3);
            currentNumber1 = (int) (Math.random() * 100);
            currentNumber2 = (int) (Math.random() * 100);

            switch (generator) {
                case 1:
                    correctAnswer = currentNumber1 + currentNumber2;
                    System.out.println("Question: " + currentNumber1 + " + " + currentNumber2);
                    break;

                case 2:
                    correctAnswer = currentNumber1 - currentNumber2;
                    System.out.println("Question: " + currentNumber1 + " - " + currentNumber2);
                    break;

                case 3:
                    correctAnswer = currentNumber1 * currentNumber2;
                    System.out.println("Question: " + currentNumber1 + " * " + currentNumber2);
                    break;
            }
            int userAnswer = answer.nextInt();

            if (userAnswer == correctAnswer) {
                countRightAnswer++;
                System.out.println("Correct!");
            }
            else {
                countRightAnswer = 0;
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was" + " '" + correctAnswer + "'.\nLet's try again!");
                break;
            }

            if (countRightAnswer == 3) {
                System.out.println("Congratulations, " + Cli.newName + "!");
            }
        }
    }
}
