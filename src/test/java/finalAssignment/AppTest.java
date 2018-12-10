package finalAssignment;

import finalAssignment.model.Lecturer;
import finalAssignment.model.Student;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;




/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCreateStudent(){
    Student student = new Student("GT12345",
            "Loc",
            "12-12-1997",
            "loc@yahoo.com",
            "12345678987",
            "bla bla",
            "bla bla");
    assertEquals("Loc", student.getName());
    assertEquals("GT12345", student.getStudentId());
    assertEquals("12-12-1997", student.getDob());
    assertEquals("loc@yahoo.com", student.getEmail());
    assertEquals("12345678987", student.getPhone());
    assertEquals("bla bla", student.getAddress());
    assertEquals("bla bla", student.getBatch());
    }

    public void testCreateLecturer(){
        Lecturer lecturer = new Lecturer("GT12345",
            "Loc",
            "12-12-1997",
            "loc@yahoo.com",
            "12345678987",
            "bla bla",
            "bla bla");
    assertEquals("Loc", lecturer.getName());
    assertEquals("GT12345", lecturer.getLecturerId());
    assertEquals("12-12-1997", lecturer.getDob());
    assertEquals("loc@yahoo.com", lecturer.getEmail());
    assertEquals("12345678987", lecturer.getPhone());
    assertEquals("bla bla", lecturer.getAddress());
    assertEquals("bla bla", lecturer.getDepartment());
    }

}
