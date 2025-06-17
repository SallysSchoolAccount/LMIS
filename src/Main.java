import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programm starten");
        System.out.println("Beliebige taste drucken um fortfahren ");
        
        while (true) {
                try {
                    int key = System.in.read();
                    // Clear Screen
                    if (key == '0') {
                         clearScreen();
                    }

                    System.out.println("Enter Text: ");
                    String text = scanner.nextLine();
                    if (text.equals("0")) {
                        System.out.println("Keinen Gultigen Text");
                        continue;
                    }

                    System.out.println(text);
                } catch (IOException e) {
                    System.out.println("An error as occured");
                }
        }
    }

    private static void clearScreen() {
        System.out.println("\\033[H\\033[2J");
        System.out.flush();
    }
}