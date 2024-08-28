package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String newName;

    public static void greetings() {
        Scanner name = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        newName = name.next();

        System.out.println("Hello, " + newName + "!");
    }

    static String getName() {
        return newName;
    }
}
