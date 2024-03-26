package practice;
import java.util.*;


public class clock{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int minute = input.nextInt();
        int false1 = 0;

        while (true){

            int thishour = input.nextInt();
            int thisminute = input.nextInt();

            if((thishour < hour) || (thishour < hour || thisminute < minute)){

                false1++;
            }
            else{
                break;
            }
        }
        System.out.println("False alarms: " + false1);


    }
}