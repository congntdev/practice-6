package practice6.library;

import java.util.AbstractList;
import java.util.ArrayList;

public class ListStudents {
    private AbstractList<Students> listStudents;

    public ListStudents() {
        this.listStudents = new ArrayList<Students>();
    }

    public ListStudents(ArrayList<Students> listStudents) {
        this.listStudents = listStudents;
    }

    public void addStudent(Students student) {
        this.listStudents.add(student);
    }

    public void printStudent() {
        for (Students student : listStudents) {
            System.out.println(student);
        }
    }
    public int countStudent() {
        return this.listStudents.size();
    }

    public int findStudent(String idFind) {
        int count = 0;
        for (Students student : listStudents ) {
            if (student.getClassId().indexOf(idFind) >= 0) {
                count ++;
            }
        }
        return count;
    }
}
