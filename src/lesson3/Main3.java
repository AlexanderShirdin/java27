package lesson3;
// Вывести из массива гласные буквы на экран
public class Main3 {
    public static void main(String[] args) {
        char[] simvols = {'a', 'v', 's', 'r', 'e', 'h', 'k'};
        for (int i = 0; i < simvols.length; i++) {
            if (simvols[i] == 'a' || simvols[i] == 'o' || simvols[i] == 'e' || simvols[i] == 'i') {
                System.out.println(simvols[i]);
            }
        }
    }
}