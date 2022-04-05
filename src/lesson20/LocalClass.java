package lesson20;

public class LocalClass {

    void operations(int delimoe, int delitel) {
        class Division {
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
