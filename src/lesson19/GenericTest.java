package lesson19;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Number> strings = new ArrayList<>();

        strings.add(5);
        strings.add(3.14);
        strings.add(4);

        for (Object string : strings) {
            String s = (String) string;
            System.out.println(s);
        }

    }
}

class Java {

}