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
        studentList = new ArrayList<>();
        studentList.add(new Student("raini", "Rainie Yang", 20));
        studentList.add(new Student("hyun", "Hyun Bin", 30));
        studentList.add(new Student("aaron", "Aaron Yang", 40));
        studentList.add(new Student("simi", "Shiela Sim", 50));
    }

    /**
     * Retrieves all the student objects.
     * <br />
     * This method should only be used to list all students. If you need
     * to retrieve a specific student, use the retrieve(String) method.
     * @return the list of students
     */
    public ArrayList<Student> retrieveAll() {
        return studentList;
    }

    /**
     * Adds a specific Student into the system
     * @param username the username of the new user
     * @param name the full name of the new user
     * @param eDollars the initial balance of the new user
     */
    public void add(String username, String name, int eDollars) {
        studentList.add(new Student(username, name, eDollars));
    }

    /**
     * retrieves a student with the specified username
     * @param username the username of the student that you are searching for
     * @return the Student object if found. Otherwise, return null.
     */
    public Student retrieve(String username) {
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            Student current = studentList.get(i);
            if (current.getUsername().equals(username)) return current;
        }
        return null;
    }

}
