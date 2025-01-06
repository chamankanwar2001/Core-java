import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 90));
        students.add(new Student("Jane", 85));
        students.add(new Student("Jake", 92));

        Collections.sort(students);
        System.out.println("Sorted Students: " + students);
    }
}
