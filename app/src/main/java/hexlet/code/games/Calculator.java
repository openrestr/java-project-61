package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final int OPERATORSCOUNT = 2;
    private static final int MAX_LENGTH = 100;

    public static void mathGame() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = generateQuestions();


        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int operator = Utils.getRandomNumber(0, OPERATORSCOUNT);
            int number1 = (Utils.getRandomNumber(0, MAX_LENGTH));
            int number2 = (Utils.getRandomNumber(0, MAX_LENGTH));
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
