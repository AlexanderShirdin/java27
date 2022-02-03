package lesson9.DZ;

public class Ellipse extends Circle {
    protected double radiusB;

    public Ellipse() {
    }

    public Ellipse(double area, double perimeter, double radiusA, double radiusB) {
        super(area, perimeter, radiusA);
        this.radiusB = radiusB;
    }

    public double getRadiusB() {
        return radiusB;
    }

    public void setRadiusB(double radiusB) {
        this.radiusB = radiusB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ellipse ellipse = (Ellipse) o;

        return Double.compare(ellipse.radiusB, radiusB) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radiusB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Еллипс: " + "площадь - " + getArea() + ", периметр - " + getPerimeter() +
                ", радиус А - " + radiusA + ", радиус B - " + radiusB + ")";
    }
}
