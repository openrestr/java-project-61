package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;


public class Progression {

    public static void progressionGame() {

        String gameDescription = "What number is missing in the progression?.";
        String[][] questionsAndAnswers = generateQuestions();

        Cli.greetings();
        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        final int minLength = 5;
        final int maxLength = 10;


        String[][] questionsAndAnswers = new String[Engine.getRounds()][2];

        for (int i = 0; i < Engine.getRounds(); i++) {

            int progressionLength = (int) (Math.random() * (maxLength - minLength + 1)) + minLength;
            int startOfProgression = (int) (Math.random() * maxLength);
            int progressionStep = (int) (Math.random() * minLength + 1);

            String[] progression = new String[progressionLength];

            for (int j = 0; j < progressionLength; j++) {
                progression[j] = String.valueOf(startOfProgression + j * progressionStep);
            }

            int hiddenIndex = (int) (Math.random() * progressionLength);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;

        }
        return questionsAndAnswers;
    }
}

