package hexlet.code;

import java.util.Scanner;

public class Cli {


    public static String greetings() {
        Scanner name = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String newName = name.nextLine();

        System.out.println("Hello, " + newName + "!");
        return newName;
    }

}






