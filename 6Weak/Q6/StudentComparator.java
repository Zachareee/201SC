import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.compareTo(o2) != 0) return o1.compareTo(o2);
        return o1.getAge() - o2.getAge();
    }
}
