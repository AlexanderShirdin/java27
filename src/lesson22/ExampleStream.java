package lesson22;

import lesson21.Students;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {
//        List<String> strings = List.of("Vlad", "Andrey", "Dima", "Elena");
//        strings.stream()
//                .filter(s -> s.length() == 4)
//                .map(s -> s.length())
//
//                .forEach(s -> System.out.println(s));

        Students student = new Students("Ivan", "Ivanov", 23, 'm', 3, 7.6);
        Students student2 = new Students("Elena", "Stepanenko", 29, 'f', 2, 6.8);
        Students student3 = new Students("Dima", "Petrov", 23, 'm', 3, 8.4);
        Students student4 = new Students("Pavel", "Mironov", 35, 'm', 5, 9.1);
        Students student5 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);

        Stream.of(student, student2, student3, student4, student5)
//                .sorted((s1,s2)-> s1.getAge()-s2.getAge())
                .sorted(Comparator
                        .comparing(Students::getCourse)
                        .thenComparing(Students::getAge)
                        .thenComparing(Students::getName))
                .distinct()
                .forEach(System.out::println);

        Integer reduce = Stream.of(3, 5, 6, 7, 8, 4, 23, 3, 8, 3, 4)
                .distinct()
                .reduce(4, (acc, el) -> acc + el);
        System.out.println(reduce);

        Stream.of(3, 5, 6, 7, 8, 4, 23, 3, 8, 3, 4);
        Stream.of(5, 3, 32, 3232, 43, 34, 763, 65, 65, 54, 4);

        Stream.concat(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10), Stream.of(45, 43, 12, 32, 8, 4, 23, 3, 8, 3, 4))
                .peek(s -> System.out.print(s+ " | "))
                .sorted()
                .findFirst().ifPresent(System.out::println);
//                .skip(5)
//                .limit(4)
//                .forEach(s -> System.out.print(" / " + s));
    }
}
