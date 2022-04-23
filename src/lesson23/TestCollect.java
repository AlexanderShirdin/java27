package lesson23;

import lesson20.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class TestCollect {
    public static void main(String[] args) {

        Students student = new Students("Ivan", "Ivanov", 23, 'm', 3, 7.6);
        Students student2 = new Students("Elena", "Stepanenko", 29, 'f', 2, 6.8);
        Students student3 = new Students("Dima", "Petrov", 23, 'm', 3, 8.4);
        Students student4 = new Students("Pavel", "Mironov", 35, 'm', 5, 9.1);
        Students student5 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);

        List<String> strings = List.of("Математика", "Информатика");
        student.setStringlist(strings);
//        List<Students> studentsList = new ArrayList<>();
//        studentsList.add(student);
//
//        studentsList.stream()

//        String collect = Stream.of(student, student2, student3, student4, student5)
//                .map(String::valueOf)
//                .map(s -> s.getName())
//                .map(Students::getName)
//                .collect(Collectors.joining(", ", "", "."));

//        System.out.println(collect);

//        Map<Character, List<Students>> mapSex = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.groupingBy(Students::getSex));
//
//        System.out.println(mapSex);

//        Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors
//                        .groupingBy(Students::getSex))
//                .forEach((sex, listStudents) -> System.out.println(sex + ": " + listStudents
//                        .stream().map(Students::getName)
//                        .collect(Collectors.toList()))
//                );
//
//        Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.partitioningBy(s -> s.getAvgMark() < 7.5))
//                .forEach((sex, listStudents) -> System.out.println(sex + ": " + listStudents
//                        .stream().map(Students::getName)
//                        .collect(Collectors.toList()))
//                );
//
//        Map<Boolean, List<Students>> mapAvgMark = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.partitioningBy(s -> s.getAvgMark() < 7.5));
//
//        mapAvgMark.get(false).forEach(s -> {s.setName("Best" + s.getName());
//            System.out.println(s);});
//
//        mapAvgMark.get(true).forEach(s -> {s.setName("Bad" + s.getName());
//            System.out.println(s);});


        IntStream.range(1, 9).forEach(s -> System.out.println("Method range " + s));
        System.out.println();
        IntStream.generate(() -> 8)
                .skip(5)
                .limit(10)
                .forEach(s -> System.out.println("Method generate " + s));
        System.out.println();
        IntStream
                .iterate(2, num -> ++num)
                .limit(10)
                .forEach(s -> System.out.println("Method iterate with 2 params " + s));
        System.out.println();
        IntStream
                .iterate(0, num -> num < 10, num -> ++num)
                .forEach(s -> System.out.println("Method iterate with 3 params " + s));
        System.out.println();
        IntStream.rangeClosed(1, 9).forEach(s -> System.out.println("Method rangeClosed " + s));

        Stream.of(student, student2, student3, student4, student5)
                .flatMapToInt(s -> IntStream.range(0, s.getAge())).forEach(System.out::println);

        Stream.of(student).flatMap(s -> s.getStringlist().stream()).forEach(System.out::println);

    }
}