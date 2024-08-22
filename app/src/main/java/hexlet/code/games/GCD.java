package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {

    public static void gcdGame() {

        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = generateQuestions();

        Cli.greetings();
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {

            int number1 = (int) (Math.random() * 11);
            int number2 = (int) (Math.random() * 11);
            String question = number1 + " " + number2;
            int correctAnswer;

            if (number1 <= 0 || number2 <= 0) throw new UnsupportedOperationException("Incorrect input");
            while(number1 != 0 && number2 != 0){
                if (number1 > number2) number1 = number1 % number2;
                else number2 = number2 % number1;
            }
            correctAnswer = number1 + number2;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }

        return questionsAndAnswers;
    }
}
