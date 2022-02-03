package lesson9.DZ;

public class Main {
    public static void main(String[] args) {
        SizeOfSpace sizeOfSpace = new SizeOfSpace();
        NumOfVertex numOfVertex = new NumOfVertex();
        Square square = new Square(9, 12, 4, 3);
        Rectangle rectangle = new Rectangle(30, 22, 4, 5, 6);
        Triangle triangle = new Triangle(6.928, 12, 3, 4);
        Circle circle = new Circle(78.5, 31.416, 5);
        Ellipse ellipse = new Ellipse(78.5, 31.416, 5, 7);
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(circle.toString());
        System.out.println(ellipse.toString());

    }
}
