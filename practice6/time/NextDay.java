package practice6.time;

import java.time.LocalDate;
import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Present's day: ");
        LocalDate inputTime = LocalDate.parse(scanner.nextLine());
        System.out.println("The next day: " + inputTime.plusDays(1));
    }
}
