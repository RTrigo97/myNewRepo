// RJ Trigo
// Hello World Assignment
// 01-26-2023
import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        String userName = "";
        String greeting = "";
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("Hello User, enter your preferred name");
        userName = userInput.nextLine();

        greeting = "Hello " + userName + ", how are you today?";

        System.out.println("\n\n" + greeting + "\n\n");
    }
}
