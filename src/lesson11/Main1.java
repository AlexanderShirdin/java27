package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("we111");
        texts.add("wer222");
        texts.add("qww333");
        texts.add(0, "tr444");
        texts.set(0, "qwqwq!!!");

        Collections.sort(texts);
        System.out.println(texts);
        //способ прохода по коллекции:
        // 1 - for (только где есть индексы)
        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));
        }

        // 2 - for each (для любой коллекции)
        for (String s : texts) {
            System.out.println(s);
        }

        // 3 - с помощью итератора (для любой коллекции)
        for (Iterator<String> iterator = texts.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}