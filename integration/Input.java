package integration;

import java.util.Scanner;

import static integration.Output.displayStringToUser;

/**
 * Created by iurii on 23.05.2022
 */
public class Input {

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer getInputInt() {
        Scanner scanner = new Scanner(System.in);
        int input = -10;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            displayStringToUser("Неправильный формат ввода. Ожидаются цифры");
        }
        return input;
    }

}
