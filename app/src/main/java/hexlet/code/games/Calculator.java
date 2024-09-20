package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {

    public static void mathGame() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = generateQuestions();

        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        final int operatorsCount = 3;
        final int maxLengthOfGenerator = 11;

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int operator = (int) (Math.random() * operatorsCount);
            int number1 = (int) (Math.random() * maxLengthOfGenerator);
            int number2 = (int) (Math.random() * maxLengthOfGenerator);
            String question;
            int correctAnswer;

            switch (operator) {
                case 0 -> {
                    question = number1 + " + " + number2;
                    correctAnswer = number1 + number2;
                }
                case 1 -> {
                    question = number1 + " - " + number2;
                    correctAnswer = number1 - number2;
                }
                case 2 -> {
                    question = number1 + " * " + number2;
                    correctAnswer = number1 * number2;
                }
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            }

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }

        return questionsAndAnswers;
    }
}
