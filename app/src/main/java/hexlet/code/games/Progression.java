package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    public static void progressionGame() {

        String gameDescription = "What number is missing in the progression?.";
        String[][] questionsAndAnswers = generateQuestions();

        Engine.playGame(gameDescription, questionsAndAnswers);
    }

    private static String[][] generateQuestions() {
        final int minLength = 5;
        final int maxLength = 10;


        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int progressionLength = Utils.getRandomNumber(minLength, maxLength);
            int startOfProgression = (Utils.getRandomNumber(0, maxLength));
            int progressionStep = Utils.getRandomNumber(1, maxLength);

            String[] progression = new String[progressionLength];

            for (int j = 0; j < progressionLength; j++) {
                progression[j] = String.valueOf(startOfProgression + j * progressionStep);
            }

            int hiddenIndex = Utils.getRandomNumber(0, progressionLength - 1);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;

        }
        return questionsAndAnswers;
    }
}

