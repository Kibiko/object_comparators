import java.util.ArrayList;
import java.util.Collections;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(12,"John",86));
        students.add(new Student(13,"Becky",87));
        students.add(new Student(14,"Callum",91));
        students.add(new Student(16,"Mike",95));
        students.add(new Student(13,"Lucy",52));
        students.add(new Student(11,"Lars",34));

        System.out.println("Sorted List by Name: ");
        Collections.sort(students, Student.StudentNameComparator);

        for(Student student : students){
            System.out.println(student.getName()+ ", "+ student.getStudentAge()+ ", " + student.getStudentScore());
        }

        System.out.println("\nSorted List by Age");
        Collections.sort(students, Student.StudentAgeComparator);

        for(Student student : students){
            System.out.println(student.getName()+ ", "+ student.getStudentAge()+ ", " + student.getStudentScore());
        }

        System.out.println("\nSorted List by Score");
        Collections.sort(students, Student.StudentScoreComparator);

        for(Student student : students){
            System.out.println(student.getName()+ ", "+ student.getStudentAge()+ ", " + student.getStudentScore());
        }

    }
}
