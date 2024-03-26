package practice;
import java.util.*;


public class hello{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.nextLine();

        System.out.println("Your name is " + name);
    }
}