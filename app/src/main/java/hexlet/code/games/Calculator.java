package hexlet.code.games;


import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calculator {

    public static void mathGame() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = generateQuestions();

        Cli.greetings();
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int operator = (int) (Math.random() * 3);
            int number1 = (int) (Math.random() * 11);
            int number2 = (int) (Math.random() * 11);
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
