package lesson9.DZ;

public class Triangle extends NumOfVertex {
    private double sideA;

    public Triangle() {
    }

    public Triangle(double area, double perimeter, int vertex, double sideA) {
        super(area, perimeter, vertex);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        return Double.compare(triangle.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "сторона А - " + sideA + ", ";
    }
}