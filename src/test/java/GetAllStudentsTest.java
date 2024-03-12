import org.example.DBAccess;

/**
 * Test class to test getting all students from table students.
 */
public class GetAllStudentsTest {

    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        dbAccess.getAllStudents();
    }
}
