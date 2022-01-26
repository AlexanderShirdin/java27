package lesson6;

public class DZ {
    public static void main(String[] args) {
        //Метод возвращает кол-во слов (числом)
        System.out.println(DZUtils.numberWordsInText("Hello World! Hello World! Hello World!"));
        System.out.println(DZUtils.numberWordsInText2("Hello World! Hello World! Hello World!"));

        //Метод печатает слова в тексте наоборот
        DZUtils.reverseCharInWords("Hello World!");
        DZUtils.reverseWordByWord("Hello World!");

        //Метод печатает на консоль количество согласных букв
        DZUtils.countSoglasFromText("Hello World! abcdefghijklmnopqrstuvwxyz");

        //Метод возвращает площадь треугольника по формуле Герона (трем сторонам)
        System.out.println(DZUtils.valueTrinagle(4, 5, 6));

        //Метод возвращает площадь равнобедренного треугольника по основанию и стороне
        System.out.println(DZUtils.valueTrinagle2(4, 5));
    }
}