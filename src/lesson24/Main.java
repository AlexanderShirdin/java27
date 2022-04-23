package lesson24;

import lesson24.service.PersonService;
import lesson24.service.PersonUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сортировка персонов по стране, городу, первому имени, второму имени:");
        PersonUtil personUtil = new PersonUtil(new PersonService());
        try {
            personUtil.printPersonsSort(3);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Результат с разделителем «,» и точкой в конце:");

        PersonUtil personUtil2 = new PersonUtil(new PersonService());
        try {
            personUtil2.printPersonsWithSeparator(3);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Результат среднего возраста персонов:");

        PersonUtil personUtil3 = new PersonUtil(new PersonService());
        try {
            personUtil3.printPersonsAvgAge(3);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Результат добавления девушкам в начало имени Mrs, а мужчинам Mr:");

        PersonUtil personUtil4 = new PersonUtil(new PersonService());
        try {
            personUtil4.printPersonsAddMrMs(3);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Результат разделения персонов по полу:");

        PersonUtil personUtil5 = new PersonUtil(new PersonService());
        try {
            personUtil5.printPersonsDivisionGender(3);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}