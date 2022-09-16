package practice6.families;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Family's count: ");
        int count = sc.nextInt();
        Person[] family = new Family[count];

        for (int i = 0; i < count; i++) {
            family[i] = new Family();
            System.out.println("Family information " + i + " : ");
            family[i].inputInformation();
            family[i].outputInformation();
        }


    }
}
