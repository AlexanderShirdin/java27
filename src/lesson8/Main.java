package lesson8;

public class Main {
    public static void main(String[] args) {
        // формула создания любого объекта
        Person vasya = new Person();
        vasya.setAge(23);
        vasya.setPosition("Бухгалтер");

        Person petya = new Person(40, "Лесоруб");
        // petya.setAge(40);
        // petya.setPosition("Лесоруб");

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
    }
}
