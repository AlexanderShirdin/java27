package lesson3;

// Создать массив цифр, с сумой соседей и себя в этих же ячейках
public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 4, 5};
        int[] sum = new int[numbers.length];
//        sum[0] = numbers[0] + numbers[1];
//        sum[1] = numbers[1] + numbers[0] + numbers[2];
//        sum[2] = numbers[2] + numbers[1] + numbers[3];
//        sum[3] = numbers[3] + numbers[2] + numbers[4];
//        sum[4] = numbers[4] + numbers[3];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sum[0] = numbers[0] + numbers[1];

            } else if (i == numbers.length - 1) {
                sum[numbers.length - 1] = numbers[numbers.length - 1] + numbers[numbers.length - 2];

            } else {
                sum[i] = numbers[i - 1] + numbers[i] + numbers[i + 1];
            }
            System.out.println(sum[i]);
        }

    }
}