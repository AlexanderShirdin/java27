package lesson20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestStudents {

    static void filteringStudent(List<Students> students, Filter filter) {
        for (Students student : students) {
            if (filter.check(student)) System.out.println(student);
        }
    }

    static void filterStudentsBAge(List<Students> students, int age) {
        for (Students student : students) {
            if (student.getAge() > age)
                System.out.println(student);
        }
    }

    static void filterStudentsBAvgMArk(List<Students> students, double avgMark) {
        for (Students student : students) {
            if (student.getAvgMark() < avgMark)
                System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Students student = new Students("Ivan", "Ivanov", 23, 'm', 3, 7.6);
        Students student2 = new Students("Elena", "Stepanenko", 29, 'f', 2, 6.8);
        Students student3 = new Students("Dima", "Petrov", 31, 'm', 3, 8.4);
        Students student4 = new Students("Pavel", "Mironov", 35, 'm', 5, 9.1);
        Students student5 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);

//        TreeSet<Students> set = new TreeSet<>(new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        List<Students> list = new ArrayList<>();

        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        filterStudentsBAge(list, 25);
        System.out.println("___________________________________");
        filterStudentsBAvgMArk(list, 8.0);
        System.out.println("___________________________________");

//                FilterImpl filterImpl = new FilterImpl();
//                filteringStudent(list, new FilterImpl());

        filteringStudent(list, new Filter() {
            @Override
            public boolean check(Students student) {
                return student.getCourse() > 2;
            }
        });
    }
}

interface Filter {
    boolean check(Students student);
}

class FilterImpl implements Filter {
    @Override
    public boolean check(Students s) {
        return s.getAge() > 25;
    }
}