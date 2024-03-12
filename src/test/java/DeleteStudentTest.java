import org.example.DBAccess;

import java.util.Scanner;

/**
 * Test class to test updating a student's email address.
 *
 * @author Braeden Kloke
 * @version March 12, 2024
 */
public class DeleteStudentTest {

    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        Scanner scanner = new Scanner(System.in);
        String studentId;

        System.out.print("Enter student ID: ");
        studentId = scanner.next();

        dbAccess.deleteStudent(studentId);
        dbAccess.getAllStudents();
    }
}
