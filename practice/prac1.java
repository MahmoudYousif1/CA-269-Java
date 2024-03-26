package practice;
import java.util.*;

public class prac1{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.nextLine();

        System.out.print("How old are you: ");
        String age = input.nextLine();

        String cur = "";

        if(Integer.parseInt(age) < 18){

            cur = "a minor";
        }
        else{
            cur = "an adult";
        }

        char [] thisname = name.toCharArray();
        int vowels = 0;

        for (int i = 0; i < name.length(); i++){

            char lower = Character.toLowerCase(thisname[i]);

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'u' || lower == 'o'){

                vowels++;
            }
        }

        System.out.println("Nice to meet you " + name + " , you have " + vowels + " vowels in your name and you are " + cur);









    }
}