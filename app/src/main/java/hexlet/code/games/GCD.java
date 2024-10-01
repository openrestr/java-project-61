package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void gcdGame() {

        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = generateQuestions();

        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {

        final int maxLengthOfGenerator = 11;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = Utils.getRandomNumber(0, maxLengthOfGenerator);
            int number2 = Utils.getRandomNumber(0, maxLengthOfGenerator);
            String question = number1 + " " + number2;
            int correctAnswer;

            while (number1 != 0 && number2 != 0) {
                if (number1 > number2) {
                    number1 = number1 % number2;
                } else {
                    number2 = number2 % number1;
                }
            }
            correctAnswer = number1 + number2;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }

        return questionsAndAnswers;
    }


}
