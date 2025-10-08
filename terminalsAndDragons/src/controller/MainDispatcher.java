package controller;

import utilities.Utilities;

import java.util.Scanner;

public class MainDispatcher {

    public static void runner() {
        System.out.println("Main Dispatcher is running...");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                int option = Integer.parseInt(Utilities.ask(scanner, "Please select an option:"));

                switch (option) {

                    case 1: System.out.println("Option 1 selected"); break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
