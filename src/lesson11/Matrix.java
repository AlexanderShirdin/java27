package lesson11;

public class Matrix implements IMatrix {
    private double[][] numbers;
    double temporary[][];
    double res = 0;

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
            throw new IndexOutOfBoundsException("rowIndex < 0 || rowIndex >= getRows()");
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("colIndex < 0 || colIndex >= getColumns()");
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            throw new IndexOutOfBoundsException("rowIndex < 0 || rowIndex >= getRows()");
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("colIndex < 0 || colIndex >= getColumns()");
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix - вторая матрица
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("getColumns() != otherMatrix.getColumns()");
        }
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("this.getRows() != otherMatrix.getRows()");
        }
        if (otherMatrix.isNullMatrix()) {
            throw new IllegalArgumentException("otherMatrix.isNullMatrix()");
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
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("getColumns() != otherMatrix.getColumns()");
        }
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("this.getRows() != otherMatrix.getRows()");
        }
        if (otherMatrix.isNullMatrix()) {
            throw new IllegalArgumentException("otherMatrix.isNullMatrix()");
        }
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
        if (this.getColumns() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("this.getColumns() != otherMatrix.getRows()");
        }
        if (otherMatrix.isNullMatrix()) {
            throw new IllegalArgumentException("otherMatrix.isNullMatrix()");
        }
        Matrix matrix = new Matrix(getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getRows(); k++) {
                    matrix.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(k, j) + matrix.getValueAt(i, j));
                }
            }
        }
        return matrix;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }
        return matrix;
    }

    @Override
    public IMatrix transpose() {
        Matrix matrix = new Matrix(getColumns(), getRows());
        for (int i = 0; i < getColumns(); i++) {
            for (int j = 0; j < getRows(); j++) {
                matrix.setValueAt(i, j, getValueAt(j, i));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix fillMatrix(double value) {
        Matrix matrix = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, value);
            }
        }
        return matrix;
    }

    @Override
    public double determinant() {
//        if (numbers.length == 1) {
//            res = numbers[0][0];
//            return (res);
//        }
//        if (numbers.length == 2) {
//            res = ((numbers[0][0] * numbers[1][1]) - (numbers[0][1] * numbers[1][0]));
//            return (res);
//        }
//        for (int i = 0; i < numbers[0].length; i++) {
//            temporary = new double[numbers.length - 1][numbers[0].length - 1];
//            for (int j = 1; j < numbers.length; j++) {
//                for (int k = 0; k < numbers[0].length; k++) {
//                    if (k < i) {
//                        temporary[j - 1][k] = numbers[j][k];
//                    } else if (k > i) {
//                        temporary[j - 1][k - 1] = numbers[j][k];
//                    }
//                }
//            }
//            res += numbers[0][i] * Math.pow(-1, (double) i) * determinant();
//        }
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (getRows() != getColumns()) {
            return false;
        }
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if ((numbers[i] == numbers[j]) && (numbers[i][j] != 1)) {
                    return false;
                } else if ((numbers[i] != numbers[j]) && (numbers[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() != getColumns()) {
            return false;
        }
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