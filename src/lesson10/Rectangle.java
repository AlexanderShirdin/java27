package lesson10;

public class Rectangle implements Figura{
    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
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

        Rectangle that = (Rectangle) o;

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
        return "Прямоугольник: " + "сторона А = " + a + ", сторона Б = " + b;
    }

    @Override
    public double perimetr() {
        return getA() * getB();
    }

    @Override
    public double ploshad() {
        return 2 * (getA() + getB());
    }
}
