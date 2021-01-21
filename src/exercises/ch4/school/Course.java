package exercises.ch4.school;

import java.util.ArrayList;

public class Course {
    //at least three fields
    //name
    private String name;
    //list of students
    private ArrayList<Student> students;
    //worth number of credits
    private int worthNumberOfCredits;

    //put constructor below class variables
    public Course(String name, int numberOfCredits){
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }
    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCoursetObj = (Course) obj;
        if (myCoursetObj.name.equals(this.name)) return true;
        else return false;
    }
}
