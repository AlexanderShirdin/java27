package lesson3;

public class DZ {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] massive = new int[numbers.length];

        // Вывод ячеек всего массива по порядку
        System.out.println("Ячейки всего массива");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Вывод ячеек всего массива с конца в начало по порядку
        System.out.println("Ячейки всего массива с конца в начало");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Вывод суммы значений всех ячеек массива
        System.out.println("Сумма значений всех ячеек");
        int sum = 0;
        //for (int num : numbers) {
        //    sum = sum + num;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        // Вывод решения: "Кого в массиве больше, четных или нечетных?"
        System.out.println("Кого в массиве больше, четных или нечетных?");
        int kolChet = 0;
        int kolNech = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                kolChet++;
            } else {
                kolNech++;
            }
        }
        if (kolChet > kolNech) {
            System.out.println("Количество четных " + kolChet + " больше чем нечетных " + kolNech);
        } else if (kolChet == kolNech) {
            System.out.println("Количество четных " + kolChet + " равана количеству нечетных " + kolNech);
        } else {
            System.out.println("Количество нечетных " + kolNech + " больше чем четных " + kolChet);
        }
    }
}