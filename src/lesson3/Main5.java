package lesson3;

// Сдвиг ячеек на одну позицию вправо в массиве
public class Main5 {
    public static void main(String[] args) {
        char[] a = {'q', 'w', 'e', 'r', 't', 'y', 'u'};
        char[] b = new char[a.length];
//        a[0] = b[1];
//        a[1] = b[2];
//        a[2] = b[3];
//        a[3] = b[4];
//        a[4] = b[5];
//        a[5] = b[0];
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                b[a.length - 1] = a[0];
            } else {
                b[i] = a[i + 1];
            }
        }
    }
}