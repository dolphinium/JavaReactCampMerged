public class Student extends User {

    private String university;
    private String yearOfSeniority;
    private int age;
    private int amountOfTakenCourse;

    public Student(int userID,String name,String surname,String username, String email, String university, String yearOfSeniority, int age, int amountOfTakenCourse) {
        this.university = university;
        this.name=name;
        this.surname=surname;
        this.yearOfSeniority = yearOfSeniority;
        this.age = age;
        this.amountOfTakenCourse = amountOfTakenCourse;
        this.userID = userID;
        this.username = username;
        this.email = email;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYearOfSeniority() {
        return yearOfSeniority;
    }

    public void setYearOfSeniority(String yearOfSeniority) {
        this.yearOfSeniority = yearOfSeniority;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmountOfTakenCourse() {
        return amountOfTakenCourse;
    }

    public void setAmountOfTakenCourse(int amountOfTakenCourse) {
        this.amountOfTakenCourse = amountOfTakenCourse;
    }
}
