package lesson9.DZ;

public class Rectangle extends Square {
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double area, double perimeter, int vertex, double sideA, double sideB) {
        super(area, perimeter, vertex, sideA);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "сторона B - " + sideB + ", ";
    }
}