import org.example.DBAccess;

import java.util.Scanner;

/**
 * Test class to test adding a student to the database.
 *
 * @author Braeden Kloke
 * @version March 12, 2024
 */
public class AddStudentTest {

    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName, email, enrollmentDate;

        System.out.print("Enter first name: ");
        firstName = scanner.next();
        System.out.print("Enter last name: ");
        lastName = scanner.next();
        System.out.print("Enter email (firstlast@email.com): ");
        email = scanner.next();
        System.out.print("Enter enrollment date (yyyy-mm-dd): ");
        enrollmentDate = scanner.next();

        dbAccess.addStudent(firstName, lastName, email, enrollmentDate);
        dbAccess.getAllStudents();
    }
}
