package lesson5;

public class Main3 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
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