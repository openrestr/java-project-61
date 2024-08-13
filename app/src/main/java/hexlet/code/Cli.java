package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greetings () {

        Scanner name = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay i have your name?");
        String newName = name.next();

        System.out.println("Hello, " + newName + "!");

        name.close();
    }
}
