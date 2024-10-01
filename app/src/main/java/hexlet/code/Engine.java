package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void playGame(String gameDescription, String[][] questionsAndAnswers) {

        try (Scanner answer = new Scanner(System.in)) {
            String userName = Cli.greetings();

            System.out.println(gameDescription);

            int countRightAnswer = 0;


            for (String[] questionAndAnswer : questionsAndAnswers) {
                String question = questionAndAnswer[0];
                String correctAnswer = questionAndAnswer[1];

                System.out.println("Question: " + question);
                String userAnswer = answer.nextLine();

                if (userAnswer.equals(correctAnswer)) {
                    countRightAnswer++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                            + "'.\nLet's try again, " + userName + "!");
                    break;
                }
            }
            if (countRightAnswer == ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
