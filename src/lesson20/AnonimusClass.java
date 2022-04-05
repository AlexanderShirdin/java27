package lesson20;

public class AnonimusClass {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public boolean check() {
                return true;
            }
        };
    }
}

interface A {
    boolean check();
}

class B implements A {

    @Override
    public boolean check() {
        return true;
    }
}