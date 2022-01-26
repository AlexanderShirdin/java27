package lesson3;
// Вывод суммы четных
public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 4, 3, 8};
        int sumChetnih = 0;
        for (int i = 0; i < 6; i++) {
            if (numbers[i] % 2 == 0) {
                sumChetnih += numbers[i];
            }
        }
        System.out.println(sumChetnih);
    }
}
