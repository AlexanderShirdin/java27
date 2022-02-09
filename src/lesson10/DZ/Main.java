package lesson10.DZ;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                if (i % 2 == 0) {                       //когда строка четная
                    if (j % 2 == 0) {                   //когда колонка четная
                        System.out.print("1 ");
                    } else {                            //когда колонка нечетная
                        System.out.print("0 ");
                    }
                } else {
                    if (j % 2 != 0) {                   //когда строка и колонка нечетные
                        System.out.print("1 ");
                    } else {                            //когда строка нечетная, колонка четная
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
