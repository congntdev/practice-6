package practice6.library;

public class Students {
    private int id;
    private String name;
    private int age;
    private String classId;
    private int cardCount;
    private String date;
    private int endDate;
    private String bookId;

    public Students() {

    }

    public Students(int id, String name, int age, String classId, int cardCount, String date, int endDate, String bookId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classId = classId;
        this.cardCount = cardCount;
        this.date = date;
        this.endDate = endDate;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
