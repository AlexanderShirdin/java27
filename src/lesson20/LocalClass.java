package lesson20;

public class LocalClass {

    void operation(int delimoe, int delitel) {
        int a = 4;
        final class Division {
            void getChasnoe() {
                System.out.println(delimoe / delitel);
            }

            void getOstatok() {
                System.out.println(delimoe % delitel);
            }
        }

        Division division = new Division();
        division.getChasnoe();
        division.getOstatok();
    }
}

class TestLocalClass {
    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();


    }
}
