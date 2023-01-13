import java.util.ArrayList;

/**
 * The StudentDAO is in charge of the Student objects in the system.
 */
public class StudentDAO {
    private ArrayList<Student> studentList;

    /**
     * Constructs a StudentDAO object.
     * with the initial list of Students (refer to project writeup)
     *
     */
    public StudentDAO() {
        // TODO
        // initialize the sample data
    }

    /**
     * Retrieves all the student objects.
     * <br />
     * This method should only be used to list all students. If you need
     * to retrieve a specific student, use the retrieve(String) method.
     * @return the list of students
     */
    public ArrayList<Student> retrieveAll() {
        // TODO
        return null;
    }

    /**
     * Adds a specific Student into the system
     * @param username the username of the new user
     * @param name the full name of the new user
     * @param eDollars the initial balance of the new user
     */
    public void add(String username, String name, int eDollars) {
        // TODO
    }

    /**
     * retrieves a student with the specified username
     * @param username the username of the student that you are searching for
     * @return the Student object if found. Otherwise, return null.
     */
    public Student retrieve(String username) {
        // TODO
        return null;
    }

}