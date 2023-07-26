import java.util.Comparator;

public class Student{

    private int studentAge;
    private String name;
    private int studentScore;

    public Student(int studentAge, String name, int studentScore) {
        this.studentAge = studentAge;
        this.name = name;
        this.studentScore = studentScore;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String studentName1 = o1.getName();
            String studentName2 = o2.getName();

            return studentName1.compareTo(studentName2); //switch the two objects if want reversed
        }
    };

    public static Comparator<Student> StudentAgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int studentAge1 = o1.getStudentAge();
            int studentAge2 = o2.getStudentAge();

            return studentAge1-studentAge2; // again switch for reverse order
        }
    };

    public static Comparator<Student> StudentScoreComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int studentScore1 = o1.getStudentScore();
            int studentScore2 = o2.getStudentScore();

            return studentScore1-studentScore2; // again switch for reverse order
        }
    };
}
