package lesson19;

import java.util.ArrayList;
import java.util.List;

public class TypeEraser {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 5, 7);

        Integer i = OtherMethod.abc(integers);
        System.out.println(i);
        Number b = OtherMethod.abcNoNStatic(integers);
        System.out.println(b);

//        List<String> string = new ArrayList<>();
//        List strings1 = new ArrayList();
//
//        String s = (String) strings1.get(0);

    }
}

class OtherMethod {

    public static <T extends Number> T abc(List<T> values) {
        return values.get(1);
    }

    public static Number abcNoNStatic(List<? extends Number> values) {
        Integer result = 0;
        for (Number value : values) {
            result += (Integer) value;
        }
        return result;
    }

}