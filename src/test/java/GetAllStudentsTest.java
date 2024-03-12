import org.example.DBAccess;

/**
 * Test class to test getting all students from the database.
 *
 * @author Braeden Kloke
 * @version March 12, 2024
 */
public class GetAllStudentsTest {

    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        dbAccess.getAllStudents();
    }
}
