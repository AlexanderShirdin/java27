package lesson24.service;

import lesson24.dto.PersonDto;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PersonUtil implements IPersonUtil {
    IPersonService<PersonDto> personService;

    @Override
    public void printPersonsSort(int amount) throws IOException, InterruptedException {
        personService.getPersonFromApi(amount)
                .stream()
                .sorted(Comparator
                .comparing(PersonDto::getCountry)
                .thenComparing(PersonDto::getCity)
                .thenComparing(PersonDto::getFirstName)
                .thenComparing(PersonDto::getLastName))
                .forEach(System.out::println);
    }

    @Override
    public void printPersonsWithSeparator(int amount) throws IOException, InterruptedException {
        String collect = personService.getPersonFromApi(amount)
                .stream()
                .map(PersonDto::toString)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(collect);
    }

    @Override
    public void printPersonsAvgAge(int amount) throws IOException, InterruptedException {
        Double reduce = Double.valueOf(personService.getPersonFromApi(amount)
                .stream()
                .peek(System.out::println)
                .map(PersonDto::getAge)
                .reduce(0, Integer::sum));
        String formattedDouble = String.format("%.1f", reduce/amount);
        System.out.println(formattedDouble);
    }

    @Override
    public void printPersonsAddMrMs(int amount) throws IOException, InterruptedException {
        Map<Boolean, List<PersonDto>> mapAddr = personService.getPersonFromApi(amount)
                .stream()
                .collect(Collectors.partitioningBy(p -> p.getGender().equals("F")));

        mapAddr.get(false).stream().map(p -> PersonDto
                .newBuilder()
                .setGender(p.getGender())
                .setFirstName("Mr." + p.getFirstName())
                .setLastName(p.getLastName())
                .setCity(p.getCity())
                .setCountry(p.getCountry())
                .setEmail(p.getEmail())
                .setDate(p.getDate())
                .setAge(p.getAge())
                .build()
        ).toList().forEach(System.out::println);

        mapAddr.get(true).stream().map(p -> PersonDto
                .newBuilder()
                .setGender(p.getGender())
                .setFirstName("Ms." + p.getFirstName())
                .setLastName(p.getLastName())
                .setCity(p.getCity())
                .setCountry(p.getCountry())
                .setEmail(p.getEmail())
                .setDate(p.getDate())
                .setAge(p.getAge())
                .build()
        ).toList().forEach(System.out::println);
    }

    @Override
    public void printPersonsDivisionGender(int amount) throws IOException, InterruptedException {
        personService.getPersonFromApi(amount)
                .stream()
                .collect(Collectors
                .<PersonDto, String>groupingBy(PersonDto::getGender))
                .forEach((s, personDtoList) -> System.out.println(s + ": " + personDtoList
                .stream().map(PersonDto::toString)
                .toList())
                );
    }
}