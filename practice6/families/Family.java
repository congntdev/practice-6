package practice6.families;

import java.text.ParseException;
import java.util.Scanner;

public class Family extends Person {
    private int id;
    private int members;
    private int electricDay;
    private Person[] list = new Person[10];

    public Family() {
        super();
    }
    public Family(Scanner sc) {
        super(sc);
    }

    public Family(String name, String birth, String job, int id, int members, int electricDay) {
        super(name, birth, job);
        this.id = id;
        this.members = members;
        this.electricDay = electricDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getElectricDay() {
        return electricDay;
    }

    public void setElectricDay(int electricDay) {
        this.electricDay = electricDay;
    }

    public Person[] getList() {
        return list;
    }

    public void setList(Person[] list) {
        this.list = list;
    }

    public void inputInformation() {
        System.out.print("Family's id: ");
        id = sc.nextInt();
        System.out.print("Family's members: ");
        members = sc.nextInt();
        System.out.print("Electric day(<31) : ");
        electricDay = sc.nextInt();
        if (electricDay < 0 || electricDay > 31) {
            System.out.println("Electric day fail!");
            System.out.print("Electric day(<31) : ");
            electricDay = sc.nextInt();
        }
        System.out.println("Member's information: ");
        for (int i =0; i < this.members; i++) {
            System.out.println("Member " + (i+1) + " : ");
            this.list[i] = new Person();
            this.list[i].inputInformation();
        }
    }

    public void outputInformation() {
        System.out.println("ID: " + id);
        System.out.println("Family's members: " + members);
        System.out.println("Member's information: ");
        for (int i =0; i < this.members; i++) {
            System.out.println("Member " + (i + 1) + " : ");
            this.list[i].outputInformation();
        }
    }

    public int cost(int members) {
        return (this.members * 2000 * this.electricDay);
    }

    public boolean holiday() throws ParseException {
        for (int i = 0; i < this.members; i++)
        {
            int lunar = this.list[i].getAge();
            if (lunar < 18)
                return true;
        }
        return false;
    }
}
