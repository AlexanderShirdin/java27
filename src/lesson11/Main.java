package lesson11;

public class Main {
    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(3, 4);

        double[][] num1 = {{2, 4, 6},
                           {4, 1, 6},
                           {2, 4, 9},
                           {2, 5, 0}};
        Matrix matrix1 = new Matrix(num1);
        System.out.println("Матрица 1: строк - " + matrix1.getRows() + ", колонок - " + matrix1.getColumns());

        double[][] num2 = {{1, 1, 2},
                           {2, 4, 2},
                           {3, 4, 8},
                           {2, 5, 0}};
        Matrix matrix2 = new Matrix(num2);
        System.out.println("Матрица 2: строк - " + matrix2.getRows() + ", колонок - " + matrix2.getColumns());


        // Проверка на единичную матрицу
        double[][] num3 = {{1, 0, 0},
                           {0, 1, 0},
                           {0, 0, 1}};
        Matrix matrix3 = new Matrix(num3);
        System.out.println("Матрица 3: строк - " + matrix3.getRows() + ", колонок - " + matrix3.getColumns());
        System.out.println(matrix3.isIdentityMatrix());

        // Проверка на нулевую матрицу
        double[][] num4 = {{0, 0, 0},
                           {0, 0, 0},
                           {0, 0, 0},
                           {0, 0, 0}};
        Matrix matrix4 = new Matrix(num4);
        System.out.println("Матрица 4: строк - " + matrix4.getRows() + ", колонок - " + matrix4.getColumns());
        System.out.println(matrix4.isNullMatrix());

        // Проверка на квадратную матрицу
        double[][] num5 = {{1, 7, 4},
                           {3, 1, 2},
                           {3, 4, 1}};
        Matrix matrix5 = new Matrix(num5);
        System.out.println("Матрица 5: строк - " + matrix5.getRows() + ", колонок - " + matrix5.getColumns());
        System.out.println(matrix5.isSquareMatrix());

        System.out.println(matrix1.getValueAt(2, 2));
//        System.out.println(matrix1.setValueAt(2,2,4));

        // Проверка на сложение и вычитание матриц
        IMatrix add = matrix5.add(matrix3);
        System.out.println();

    }
}