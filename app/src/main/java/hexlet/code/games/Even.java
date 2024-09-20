package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void isEven() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = generateQuestions();

        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {

        final int maxLengthOfGenerator = 100;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = (int) (Math.random() * maxLengthOfGenerator);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }

        return questionsAndAnswers;
    }
}
