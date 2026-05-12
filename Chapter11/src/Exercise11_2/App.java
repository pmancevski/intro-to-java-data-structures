package Exercise11_2;

public class App {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234",
                "john@example.com");
        Student student = new Student("Jane Smith", "456 Oak Ave", "555-5678",
                "jane@example.com", Student.SOPHOMORE);
        Employee employee = new Employee("Bob Johnson", "789 Pine Rd", "555-9012",
                "bob@example.com", "Office A", 50000);
        Faculty faculty = new Faculty("Dr. Brown", "101 University Blvd", "555-3456",
                "drbrown@example.com", "Office B", 75000, 10.5, "Professor");
        Staff staff = new Staff("Mary Davis", "202 College St", "555-7890",
                "mary@example.com", "Office C", 45000, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
