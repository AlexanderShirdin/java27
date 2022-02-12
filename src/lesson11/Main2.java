package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long starTimeArrayAdd = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i + "jsdhf");
        }
        long andTimeArrayAdd = System.currentTimeMillis();
        System.out.println("ArrayList add " + (andTimeArrayAdd - starTimeArrayAdd));

        long starTimeLinkedAdd = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           linkedList.add(i + "jsdhf");
        }
        long andTimeLinkedAdd = System.currentTimeMillis();
        System.out.println("LinkedList add " + (andTimeLinkedAdd - starTimeLinkedAdd));



        long starTimeArrayGet = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long andTimeArrayGet = System.currentTimeMillis();
        System.out.println("ArrayList get " + (andTimeArrayGet - starTimeArrayGet));

        long starTimeLinkedGet = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long andTimeLinkedGet = System.currentTimeMillis();
        System.out.println("LinkedList get " + (andTimeLinkedGet - starTimeLinkedGet));
    }
}