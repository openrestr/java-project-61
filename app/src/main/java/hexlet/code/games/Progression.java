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
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int minLength = 5;
            int maxLength = 10;
            int progressionLength = (int) (Math.random() * ++maxLength) + minLength;
            int startOfProgression = (int) (Math.random() * 10 + 1);
            int progressionStep = (int) (Math.random() * 5 + 1);

            String[] progression = new String [progressionLength];

            for (int j = 0; j < progressionLength; j++) {
                progression[j] = String.valueOf(startOfProgression + j * progressionStep);
            }

            int hiddenIndex = (int) (Math.random() * progressionLength + 1);
            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);

        }
        return questionsAndAnswers;
    }
}

