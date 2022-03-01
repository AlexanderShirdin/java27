package lesson16;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 не число!!!");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 не число!!!");
        }
        if (num2 == 0.0) {
            throw new ArithmeticException("Деление на 0 запрещено");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        ArrayList<Integer> words = new ArrayList<>();
        for (int i = -1; (i = text.indexOf(word, i + 1)) != -1; i++) {
            words.add(i);
        }
        if (words.size() == 0) {
            throw new NullPointerException("Не найдено ни одного слова " + word);
        }
       int[] result = new int[words.size()];
        for (int i = 0; i < words.size(); i++) {
            result[i] = words.get(i);
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> numbers = new ArrayList<>();
        Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
        while (m.find()) {
            numbers.add(Double.parseDouble(m.group(1)));
        }
        if (numbers.size() == 0) {
            throw new CustomException("Не найдено ни одного числа");
        }

        double[] result = new double[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}