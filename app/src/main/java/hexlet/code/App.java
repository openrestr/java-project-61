package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        int answer = input.nextInt();

        switch (answer) {

            case 1:
                Cli.greetings();
                break;

            case 2:
                Even.isEven();
                break;
        }
    }
}


