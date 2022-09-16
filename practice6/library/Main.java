package practice6.library;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudents listStudent = new ListStudents();
        int choose = 0;
        do {
            System.out.println(
                    "1. Add student. \n"
                    + "2. Print student's list. \n"
                    + "3. Count students of class. \n"
                    + "4. Find students of class. \n"
                    + "0. Exit program.");
            choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                System.out.print("Student's code: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Class: ");
                String classId = sc.nextLine();
                System.out.print("Book's number: ");
                int cardCount = sc.nextInt();
                System.out.print("Borrowed date: ");
                String date = sc.nextLine();
                System.out.print("Days to return: ");
                int endDate = sc.nextInt();
                System.out.print("Book's id: ");
                String bookId = sc.next();
                Students student = new Students(id, name, age, classId, cardCount, date, endDate, bookId);
                listStudent.addStudent(student);
            } else if (choose == 2) {
                listStudent.printStudent();
            } else if (choose == 3) {
                System.out.print("Student's number: " + listStudent.countStudent());
            } else if (choose == 4) {
                System.out.print("Class's id: ");
                String classId = sc.nextLine();
                System.out.print("Students of class " + classId + " : " + listStudent.findStudent(classId));
            }
        }while (choose != 0);
    }

}
