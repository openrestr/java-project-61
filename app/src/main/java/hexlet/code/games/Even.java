package hexlet.code.games;

import hexlet.code.*;

public class Even {

    public static void isEven() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = generateQuestions();

        Cli.greetings();
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        return questionsAndAnswers;
    }
}