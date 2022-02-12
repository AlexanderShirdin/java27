package lesson11;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("111");
        texts.add("222");
        texts.add("333");
        texts.add(0,"444");
        texts.set(0,"!!!");
        System.out.println(texts);
    }
}