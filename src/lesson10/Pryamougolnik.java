package lesson10;

public class Pryamougolnik implements Figura{
    private int a;
    private int b;

    public Pryamougolnik() {
    }

    public Pryamougolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pryamougolnik that = (Pryamougolnik) o;

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Pryamougolnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double perimetr() {
        return 0;
    }

    @Override
    public double ploshad() {
        return 0;
    }
}
