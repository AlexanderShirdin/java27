package lesson3;
// Задать массив фиксированной длинны, с заданного значения с шагом 2
public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int value = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
            System.out.println(numbers[i]);
        }
    }
}
