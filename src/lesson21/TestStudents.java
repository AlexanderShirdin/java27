package lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudents {

    static void filteringStudent(List<Students> students, Predicate<Students> predicate) {
        for (Students student : students) {
            if (predicate.test(student)) System.out.println(student);
        }
    }

    static void getAvg(List<Students> studentsList, Function<Students, Integer> function){
        double result = 0;
        for (Students stu1 : studentsList) {
            result += function.apply(stu1);
        }
        System.out.println(result/studentsList.size());
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

        getAvg(list, s11 -> (s11.getAge()));

        list.forEach(s4 -> {System.out.println(s4); s4.setAge(s4.getAge()+5);});

        Predicate<Students> predicate = s -> s.getAge() < 25;
        Predicate<Students> predicate2 = s -> s.getCourse() < 4;
        list.removeIf(predicate2.negate());
        list.removeIf(predicate.or(predicate2));

//        filterStudentsBAge(list, 25);
//        System.out.println("___________________________________");
//        filterStudentsBAvgMArk(list, 8.0);
//        System.out.println("___________________________________");

//                FilterImpl filterImpl = new FilterImpl();
//                filteringStudent(list, new FilterImpl());

//        filteringStudent(list, new Filter() {
//            @Override
//            public boolean check(Students student) {
//                return student.getCourse() > 2;
//            }
//        });

//        filteringStudent(list, (Students student1) -> {return student1.getCourse() > 2;});
        filteringStudent(list, s -> s.getCourse() > 0); //только с одним параметром и одним выражением
    }
}

interface Filter {
    boolean check(Students student);
}

//class FilterImpl implements Filter {
//    @Override
//    public boolean check(Students s) {
//        return s.getAge() > 25;
//    }
//}