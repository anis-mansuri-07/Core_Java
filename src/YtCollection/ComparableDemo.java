package YtCollection;

import java.util.ArrayList;

class Student implements Comparable<Student> {
    private final String name;
    private final int no;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }


    @Override
    public int compareTo(Student o) {

        return Double.compare(this.no, o.no);
        // this means Ascending and o first means Descending
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(7, "Alice");
        Student s2 = new Student(8, "Charlie");
        Student s3 = new Student(3, "Bob");
        Student s4 = new Student(85, "Dell");
        Student s5 = new Student(1, "Bill");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.sort(null);
        System.out.println(list);


/*
        // this will fine for Integer and String
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(2);
        list1.add(99);
        list1.sort(null);
        System.out.println(list1);
*/
    }
}
