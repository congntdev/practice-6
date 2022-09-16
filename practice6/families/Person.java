package practice6.families;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Person{
    protected Scanner sc = new Scanner(System.in);
    protected String name;
    protected String birth;
    protected int age;
    protected String job;

    public Person() {

    }

    public Person(String name, String birth,  String job) {
        this.name = name;
        this.birth = birth;
        this.job = job;
    }

    public Person(Scanner sc) {
        this.sc = sc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getAge() throws ParseException {
        birth = sc.next();
        final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dateDate = df.parse(birth);
        int year = dateDate.getYear() + 1900;
        Calendar c = Calendar.getInstance();
        int yearC = c.get(Calendar.YEAR);
        return yearC - year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputInformation() {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Birthday(dd/MM/yyyy): ");
        birth = sc.nextLine();
        System.out.print("Job: ");
        job = sc.nextLine();
    }

    public void outputInformation() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birth);
        System.out.println("Job: " + job);
    }

}
