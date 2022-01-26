package lesson3;
// Вывод в обратном порядке через одну
public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 8, 9};
        for (int i = 5; i >= 1; i = i - 2) {
            System.out.println(numbers[i]);
        }
    }
}