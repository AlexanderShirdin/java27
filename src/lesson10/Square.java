package lesson10;

public class Square implements Figura {
    private Rectangle pryamougolnik = new Rectangle();

    public Square() {
    }

    public Square(int a) {
        pryamougolnik.setA(a);
        pryamougolnik.setB(a);
    }

    public int getA() {
        return pryamougolnik.getA();
    }

    public void setA(int a) {
        pryamougolnik.setA(a);
        pryamougolnik.setB(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square kvadrat = (Square) o;

        return pryamougolnik != null ? pryamougolnik.equals(kvadrat.pryamougolnik) : kvadrat.pryamougolnik == null;
    }

    @Override
    public int hashCode() {
        return pryamougolnik != null ? pryamougolnik.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Квадрат: сторона A = " + getA();
    }

    @Override
    public double perimetr() {
        return 4 * getA();
    }

    @Override
    public double ploshad() {
        return getA() * getA();
    }
}
