import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        clearScreen();
        typer("Microsoft DOS [Version 1.0]\n", 10);
        typer("All rights Reserved to Microsoft Corp 1984 - 2025", 10);
        clearScreen();

    }

    public static void typer(String text, int delay) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }
    }


    // Clears the terminal
    public static void clearScreen() {
        //*
        // System.out.print("\033[H\033[2J");
        //  System.out.flush();

        new ProcessBuilder("cmd", "/c", "cls");
    }
}