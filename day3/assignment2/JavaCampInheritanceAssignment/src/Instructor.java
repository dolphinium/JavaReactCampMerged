public class Instructor extends User {


    private int givenCourseAmount;
    private int salary;

    public Instructor(int userID,String name,String surname,String email,int givenCourseAmount, int salary) {
        super();
        this.surname=surname;
        this.name=name;
        this.userID=userID;
        this.email=email;
        this.givenCourseAmount = givenCourseAmount;
        this.salary = salary;
    }
    public int getGivenCourseAmount() {
        return givenCourseAmount;
    }

    public void setGivenCourseAmount(int givenCourseAmount) {
        this.givenCourseAmount = givenCourseAmount;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;


    }
}
