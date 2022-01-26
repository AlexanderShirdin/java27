package lesson2;

public class DZ {
    public static void main(String[] args) {

        System.out.println("Только четные от 100 до 150");
        for (int i = 100; i <= 150; i++) {  //только четные от 100 до 150
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Сумма четных чисел от 20 до 40");
        int sum1 = 0;                       //сумма четных чисел от 20 до 40
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println(sum1);

        System.out.println("Числа от 10 до 50, без диапазона от 20 до 25");
        for (int i = 10; i <= 50; i++) {    //числа от 10 до 50, без диапазона от 20 до 25
            if (i < 20 || i > 25) {
                System.out.println(i);
            }
        }

        System.out.println("Среднее значение всех нечетных чисел от 0 до 100");
        int sum3 = 0;
        int kol = 0;
        for (int i = 0; i <= 100; i++) {    //среднее значение всех нечетных чисел от 0 до 100
            if (i % 2 == 1) {
                sum3 += i;
                kol++;
            }
        }
        System.out.println(sum3 / kol);

        System.out.println("Числа от -10 до -40");
        for (int i = -10; i != -41; i--) {  //числа от -10 до -40
            System.out.println(i);
        }
    }
}