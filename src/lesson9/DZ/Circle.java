package lesson9.DZ;

public class Circle extends SizeOfSpace {
    private double radiusA;

    public Circle() {
    }

    public Circle(double area, double perimeter, double radiusA) {
        super(area, perimeter);
        this.radiusA = radiusA;
    }

    public double getRadiusA() {
        return radiusA;
    }

    public void setRadiusA(double radiusA) {
        this.radiusA = radiusA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radiusA, radiusA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radiusA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "радиус А - " + radiusA + ", ";
    }
}