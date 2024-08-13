package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void isEven() {
        Cli.greetings();

        String userName = Cli.newName;
        int countRightAnswer = 0;
        int currentNumber;
        String correctAnswer;

        Scanner answer = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        while (countRightAnswer < 3) {

            currentNumber = (int) (Math.random() * 100);
            if (currentNumber % 2 == 0) {
                correctAnswer = "yes";
            }
            else {
                correctAnswer = "no";
            }
            System.out.println("Question:" + " " + currentNumber);
            String userAnswer = answer.next();

            if (userAnswer.equals(correctAnswer)) {
                countRightAnswer++;
                System.out.println("Correct!");
            }
            else {
                countRightAnswer = 0;
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was" + " '" + correctAnswer + "'.\nLet's try again!");
                break;
            }

        }
        if (countRightAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}