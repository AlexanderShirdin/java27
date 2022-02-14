package lesson11;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int row, int col) {
        numbers = new double[row][col];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return -1;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix - вторая матрица
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не одинаковое кол-во колонок!");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не одинаковое кол-во строк!");
            return null;
        }
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrix = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getRows(); k++) {
                    matrix.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(k, j));
                }
            }
        }
        return matrix;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        Matrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, getValueAt(i, j));
            }
        }
        numbers[getRows()][getColumns()] = value;
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    System.out.println("Матрица не является нулевой");
                    return false;
                }
            }
        }
        System.out.println("Матрица является нулевой");
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers.length != numbers[0].length) {
                    System.out.println("Матрица не квадратная");
                    return false;
                } else if ((numbers[i] == numbers[j]) && (numbers[i][j] != 1)) {
                    System.out.println("Матрица не является единичной");
                    return false;
                } else if ((numbers[i] != numbers[j]) && (numbers[i][j] != 0)) {
                    System.out.println("Матрица не является единичной");
                    return false;
                }
            }
        }
        System.out.println("Матрица является единичной");
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (getRows() != getColumns()) {
                    System.out.println("Матрица не является квадратной");
                    return false;
                }
            }
        }
        System.out.println("Матрица является квадратной");
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}