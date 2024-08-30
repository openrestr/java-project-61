package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS = 3;

    public static void playGame(String gameDescription, String[][] questionsAndAnswers) {
        Scanner answer = new Scanner(System.in);

        System.out.println(gameDescription);

        int countRightAnswer = 0;


        for (String[] questionAndAnswer : questionsAndAnswers) {
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            String userAnswer = answer.next();

            if (userAnswer.equals(correctAnswer)) {
                countRightAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                        + "'.\nLet's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (countRightAnswer == ROUNDS) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

    public static int getRounds() {
        return ROUNDS;
    }
}
