package lesson12.DZ;

import java.util.HashSet;
import java.util.Set;

// пересечение множеств (5 методов)
public class DZ {
    public static void main(String[] args) {
        Set<Integer> coll1 = new HashSet<>();
        coll1.add(2);
        coll1.add(1);
        coll1.add(4);
        coll1.add(5);
        coll1.add(6);
        coll1.add(7);
        coll1.add(11);
        System.out.println("Колекция 1: " + coll1);

        Set<Integer> coll2 = new HashSet<>();
        coll2.add(1);
        coll2.add(2);
        coll2.add(8);
        coll2.add(9);
        coll2.add(10);
        coll2.add(6);
        coll2.add(11);
        coll2.add(3);
        System.out.println("Колекция 2: " + coll2);

        // Методы реализации множеств
        Set<Integer> coll3 = new HashSet<>();
        // Метод пересечения множеств
        coll3.addAll(coll1);
        coll3.retainAll(coll2);
        System.out.println("1. Пересечение 1 и 2 коллекций: " + coll3);

        // Метод разности коллекций
        coll3.addAll(coll1);
        coll3.removeAll(coll2);
        System.out.println("2. Разность 2 коллекции к 1: " + coll3);
        coll3.addAll(coll2);
        coll3.removeAll(coll1);
        System.out.println("3. Разность 1 коллекции ко 2: " + coll3);

        // Метод объедения коллекций
        coll3.addAll(coll1);
        coll3.addAll(coll2);
        System.out.println("4. Объединение 1 и 2 коллекций: " + coll3);

        // Метод симметричной разности коллекций
        coll3.addAll(coll1);
        coll3.addAll(coll2);
        coll1.retainAll(coll2);
        coll3.removeAll(coll1);
        System.out.println("5. Симметричная разность 1 и 2 коллекций: " + coll3);
    }
}