package Exercise13_13;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course copy = new Course(this.getCourseName());
        copy.numberOfStudents = this.numberOfStudents;
        String[] copyStudents = new String[this.students.length];

        for (int count = 0; count < this.students.length; count++) {
            copyStudents[count] = students[count];
        }

        copy.students = copyStudents;

        return copy;
    }
}
