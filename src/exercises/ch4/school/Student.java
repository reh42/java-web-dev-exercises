package exercises.ch4.school;

public class Student {

    public static void main(String[] args){
        Student mySelf = new Student("Becca", 1, 30, 4.0);
        Student twin = new Student("Becca",2, 20, 2.0);
        Teacher theTeacher = new Teacher();
        //String myGradeLevel =mySelf.getGradeLevel();
        //System.out.println(myGradeLevel);
//        mySelf.addGrade(3,3.0);
//        System.out.println(mySelf.gpa);
//        mySelf.addGrade(3,3.0);
//        System.out.println(mySelf.gpa);

        //System.out.println(mySelf.equals(theTeacher));
        Course myFirstCourse = new Course("My First Course", 3);
        Course mySecondCourse = new Course ("My First Course", 2);
        //System.out.println(myFirstCourse.equals(mySecondCourse));

        System.out.println(myFirstCourse.toString());



    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        //quality score = letter grade score (0.0-4.0) *  the number of credits.
        double newQualityScore = grade*courseCredits;


        // current total quality score = gpa * number of credits
        double currentTotalQualityScore = this.gpa * this.numberOfCredits; //why is double lowercase here???

        //The total quality score is the sum of the quality scores for all classes (add new Qscore to current score)
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        //update total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
       //update number of credit class variable
        this.numberOfCredits = newTotalNumberOfCredits;

        //gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        // update student's gpa
        this.gpa = newGpa;


    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        //  Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)

        //return student level depending on number of credits
        if (this.numberOfCredits >= 0 & this.numberOfCredits<= 29){
            return "Freshman";
        } else if (this.numberOfCredits >= 30 & this.numberOfCredits<= 59){
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 & this.numberOfCredits<= 89){
            return "Junior";
        } else if (this.numberOfCredits >=90){ //hard conditional
            return "Senior";
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return this.name + ":" + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;
            //can but {} if you want or put them all in one line
    }

    /* getters and setters omitted */
    public String getName(){ return this.name;}

    public void setName(String name){this.name = name;}

    public int getStudentId(){ return this.studentId;}

    private void setStudentId(int studentId){this.studentId = studentId;}

    public int getNumberOfCredits(){ return this.numberOfCredits;}

    public void setNumberOfCredits(int numberOfCredits){this.numberOfCredits = numberOfCredits;}

    public double getGpa(){ return this.gpa;}

    public void setGpa(double gpa){this.gpa = gpa;}





}
