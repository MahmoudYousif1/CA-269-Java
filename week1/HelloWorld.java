
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Scanner object for taking input from the command line
        Scanner input = new Scanner(System.in);

        // Prompting the user for their name
        System.out.print("Name: ");
        String name = input.nextLine();

        // Greeting the user
        System.out.println("Hello, World! " + name + " is now a Java programmer!");

        // Displaying a customized message
            

        // Closing the Scanner object
        input.close();
    }
}









