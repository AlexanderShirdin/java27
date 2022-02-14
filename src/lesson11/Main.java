package lesson11;

public class Main {
    public static void main(String[] args) {

        double[][] num1 = {{2, 4, 6},
                {4, 1, 6},
                {2, 4, 9},
                {2, 5, 0}};
        Matrix matrix1 = new Matrix(num1);
        System.out.println("Матрица 1");
        matrix1.printToConsole();
        System.out.println();

        double[][] num2 = {{1, 1, 2},
                {2, 4, 2},
                {3, 4, 8},
                {2, 5, 0}};
        Matrix matrix2 = new Matrix(num2);
        System.out.println("Матрица 2");
        matrix2.printToConsole();
        System.out.println();

        double[][] num3 = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};
        Matrix matrix3 = new Matrix(num3);
        System.out.println("Матрица 3");
        matrix3.printToConsole();
        // Проверка на единичную матрицу
        System.out.println(matrix3.isIdentityMatrix());
        System.out.println();

        double[][] num4 = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Matrix matrix4 = new Matrix(num4);
        System.out.println("Матрица 4");
        matrix4.printToConsole();
        // Проверка на нулевую матрицу
        System.out.println(matrix4.isNullMatrix());
        System.out.println();

        double[][] num5 = {{1, 7, 4},
                {3, 1, 2},
                {3, 4, 1}};
        Matrix matrix5 = new Matrix(num5);
        System.out.println("Матрица 5");
        matrix5.printToConsole();
        // Проверка на квадратную матрицу
        System.out.println(matrix5.isSquareMatrix());
        System.out.println();

        double[][] num6 = {{1, 1, 2, 4},
                {2, 4, 2, 5},
                {2, 5, 0, 1}};
        Matrix matrix6 = new Matrix(num6);
        System.out.println("Матрица 6");
        matrix6.printToConsole();
        System.out.println();

        // Возвращает элемент матрицы по заданным индексам
        System.out.println("Элемент Матрицы 6 по индексам строки и столбца (1, 3)");
        System.out.println(matrix6.getValueAt(1, 3));
        System.out.println();

        // Результат сложения матриц
        IMatrix add = matrix5.add(matrix3);
        System.out.println("Результата сложения Матриц 5 и 3");
        add.printToConsole();
        System.out.println();

        // Результат вычитания матриц
        IMatrix sub = matrix5.sub(matrix3);
        System.out.println("Результата вычитания Матриц 3 из 5");
        sub.printToConsole();
        System.out.println();

        // Результат умножения матриц
        IMatrix mul = matrix1.mul(matrix6);
        System.out.println("Результата умножения Матриц 1 на 6");
        mul.printToConsole();
        System.out.println();

        // Результат умножения матрицы на заданное значение
        IMatrix mul2 = matrix1.mul(3);
        System.out.println("Результат умножения Матрицы 1 на значением 3");
        mul2.printToConsole();
        System.out.println();

        // Транспонирование матрицы
        IMatrix transpose = matrix1.transpose();
        System.out.println("Транспонирование Матрицы 1");
        transpose.printToConsole();
        System.out.println();

        // Заполнение матрицы заданным значением
        IMatrix fill = matrix1.fillMatrix(6);
        System.out.println("Заполнение Матрицы 1 значением 6");
        fill.printToConsole();
        System.out.println();
    }
}