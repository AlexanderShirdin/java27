package lesson9.DZ;

public class NumOfVertex extends SizeOfSpace {
   private int vertex;

    public NumOfVertex() {
    }

    public NumOfVertex(double area, double perimeter, int vertex) {
        super(area, perimeter);
        this.vertex = vertex;
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        NumOfVertex that = (NumOfVertex) o;

        return vertex == that.vertex;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + vertex;
        return result;
    }

    @Override
    public String toString() {
        return "NumOfVertex{" +
                "vertex=" + vertex +
                '}';
    }
}