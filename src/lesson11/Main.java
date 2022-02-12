package lesson11;

public class Main {
    public static void main(String[] args) {
//        Matrix matrix1 = new Matrix(3, 4);
//        System.out.println(matrix1.getRows());
//        System.out.println(matrix1.getColumns());

        double[][] num2 = {{2, 4, 6},
                           {4, 1, 6},
                           {2, 4, 9},
                           {2, 5, 0}};
        Matrix matrix2 = new Matrix(num2);

        double[][] num1 = {{1, 1, 2},
                           {2, 4, 2},
                           {3, 4, 8},
                           {2, 5, 0}};
        Matrix matrix1 = new Matrix(num1);

        System.out.println(matrix2.isNullMatrix());

        IMatrix add = matrix2.add(matrix1);
        System.out.println();
    }
}