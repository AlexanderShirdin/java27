package lesson19;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Object> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("js");
        strings.add("s");

        for (Object string : strings) {
            String s = (String) string;
            System.out.println(s);
        }

    }
}

class Java {

}