package week1;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int falseAlarms = 0;
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        while (true) {
            int thisHour = scanner.nextInt();
            int thisMinute = scanner.nextInt();

            if ((thisHour < hour) || (thisHour == hour && thisMinute < minute)) {
                falseAlarms++;
            } else {
                break;
            }
        }

        System.out.println("false alarms: " + falseAlarms);
        scanner.close();
    }
}
