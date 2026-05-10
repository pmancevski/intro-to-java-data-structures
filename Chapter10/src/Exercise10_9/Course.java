package Exercise10_9;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length + 10];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public String[] getStudents() {
        String[] studentsCopy = new String[getNumberOfStudents()];

        for (int count = 0; count < getNumberOfStudents(); count++){
            studentsCopy[count] = students[count];
        }

        return studentsCopy;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
        int studentIndex = - 1;

        for (int count = 0; count < getNumberOfStudents(); count++){
            if (students[count].equals(student)){
                studentIndex = count;
            }
        }

        if (studentIndex >= 0) {
            for (int count = studentIndex; count < getNumberOfStudents() - 1; count++){
                students[count] = students[count + 1];
            }

            numberOfStudents--;
        }
    }

    public void clear(){
        students = new String[10];
        numberOfStudents = 0;
    }
}
