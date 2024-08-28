package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {

    public static void isPrimeGame() {

        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = generateQuestions();

        Cli.greetings();
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        final int rounds = 3;
        final int questionsCount = 3;
        final int maxLengthOfGenerator = 30;

        String[][] questionsAndAnswers = new String[questionsCount][2];

        for (int i = 0; i < rounds; i++) {
            int number = (int) (Math.random() * maxLengthOfGenerator + 1);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        return questionsAndAnswers;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
