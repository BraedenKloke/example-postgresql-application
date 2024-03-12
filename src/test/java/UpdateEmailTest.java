import org.example.DBAccess;

import java.util.Scanner;

/**
 * Test class to test updating a student's email address.
 *
 * @author Braeden Kloke
 * @version March 12, 2024
 */
public class UpdateEmailTest {

    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        Scanner scanner = new Scanner(System.in);
        String studentId, email;

        System.out.print("Enter student ID: ");
        studentId = scanner.next();
        System.out.print("Enter email (firstlast@email.com): ");
        email = scanner.next();

        dbAccess.updateStudentEmail(studentId, email);
        dbAccess.getAllStudents();
    }
}
