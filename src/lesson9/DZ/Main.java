package lesson9.DZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SizeOfSpace sizeOfSpace = new SizeOfSpace();
        NumOfVertex numOfVertex = new NumOfVertex();
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - квадрат");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - равносторонний треугольник");
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        // Вычисление площади и окружности круга
        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            circle.setRadiusA(Double.parseDouble(radiusStr));
            sizeOfSpace.setArea(Math.PI * (circle.getRadiusA() * circle.getRadiusA()));
            sizeOfSpace.setPerimeter(2 * Math.PI * circle.getRadiusA());
            System.out.println("Круг: (" + circle.toString() + sizeOfSpace.toString());
        }
        // Вычисление площади и периметра овала
        else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            System.out.println("Введите длинну (большой) плуоси А: ");
            String radiusStrA = scanner.nextLine();
            circle.setRadiusA(Double.parseDouble(radiusStrA));
            System.out.println("Введите длинну (малой) плуоси B: ");
            String radiusStrB = scanner.nextLine();
            ellipse.setRadiusB(Double.parseDouble(radiusStrB));
            sizeOfSpace.setArea(Math.PI * circle.getRadiusA() * ellipse.getRadiusB());
            sizeOfSpace.setPerimeter(4 * (Math.PI * circle.getRadiusA() * ellipse.getRadiusB() + ((circle.getRadiusA() - ellipse.getRadiusB()) * (circle.getRadiusA() - ellipse.getRadiusB()))) / (circle.getRadiusA() + ellipse.getRadiusB()));
            System.out.println("Овал: (" + circle.toString() + ellipse.toString() + sizeOfSpace.toString());
        }
        // Вычисление площади и периметра квадрата
        else if (figura.equals("3") || figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Введите длинну стороны А: ");
            String storonaPrStrA = scanner.nextLine();
            square.setSideA(Double.parseDouble(storonaPrStrA));
            int step = 2;
            sizeOfSpace.setArea(Math.pow(square.getSideA(), step));
            sizeOfSpace.setPerimeter(4 * square.getSideA());
            System.out.println("Квадрат: (" + square.toString() + sizeOfSpace.toString());
        }
        // Вычисление площади и периметра прямоугольника
        else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите длинну стороны А: ");
            String storonaPrStrA = scanner.nextLine();
            square.setSideA(Double.parseDouble(storonaPrStrA));
            System.out.println("Введите длинну стороны B: ");
            String storonaPrStrB = scanner.nextLine();
            rectangle.setSideB(Double.parseDouble(storonaPrStrB));
            sizeOfSpace.setArea(square.getSideA() * rectangle.getSideB());
            sizeOfSpace.setPerimeter(2 * (square.getSideA() + rectangle.getSideB()));
            System.out.println("Прямоугольник: (" + square.toString() + rectangle.toString() + sizeOfSpace.toString());
        }
        // Вычисление площади и периметра треугольника
        else if (figura.equals("5") || figura.equalsIgnoreCase("равносторонний треугольник")) {
            System.out.println("Введите длинну стороны А: ");
            String storonaPrStrA = scanner.nextLine();
            triangle.setSideA(Double.parseDouble(storonaPrStrA));
            int step = 2;
            sizeOfSpace.setArea((Math.pow(triangle.getSideA(), step) * Math.sqrt(3)) / 4);
            sizeOfSpace.setPerimeter(3 * triangle.getSideA());
            System.out.println("Равносторонний треугольник: (" + triangle.toString() + sizeOfSpace.toString());
        } else {
            System.out.println("Некорректный ввод");
        }
    }
//        Square square = new Square(9, 12, 4, 3);
//        Rectangle rectangle = new Rectangle(30, 22, 4, 5, 6);
//        Triangle triangle = new Triangle(6.928, 12, 3, 4);
//        Circle circle = new Circle(78.5, 31.416, 5);
//        Ellipse ellipse = new Ellipse(78.5, 31.416, 5, 7);
//        System.out.println(square.toString());
//        System.out.println(rectangle.toString());
//        System.out.println(triangle.toString());
//        System.out.println(circle.toString());
//        System.out.println(ellipse.toString());
}

