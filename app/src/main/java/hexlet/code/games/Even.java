package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void evenGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = generateQuestions();

        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {

        final int maxLengthOfGenerator = 100;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomNumber(0, maxLengthOfGenerator);
            String correctAnswer = isEven(number);

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        return questionsAndAnswers;
    }
    public static String isEven(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }

}
