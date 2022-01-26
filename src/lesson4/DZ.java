package lesson4;

import java.util.Scanner;

public class DZ {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - треугольник");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - трапеция");
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        // Вычисление площади и окружности круга
        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);
            System.out.println("Площадь или Окружность?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (radius * radius)));
            } else if (action.equalsIgnoreCase("Окружность")) {
                System.out.println("Окружность круга: " + (2 * Math.PI * radius));
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        // Вычисление площади и периметра овала
        else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            System.out.println("Введите длинну (большой) плуоси А: ");
            String radiusStrA = scanner.nextLine();
            double radiusA = Double.parseDouble(radiusStrA);
            System.out.println("Введите длинну (малой) плуоси B: ");
            String radiusStrB = scanner.nextLine();
            double radiusB = Double.parseDouble(radiusStrB);
            System.out.println("Площадь или Периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь овала: " + (Math.PI * radiusA * radiusB));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр овала: " + (4 * (Math.PI * radiusA * radiusB + ((radiusA - radiusB) * (radiusA - radiusB))) / (radiusA + radiusB)));
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        // Вычисление площади и периметра треугольника
        else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {
            System.out.println("Введите длинну стороны А: ");
            String storonaTrStrA = scanner.nextLine();
            double storonaTrA = Double.parseDouble(storonaTrStrA);
            System.out.println("Введите длинну стороны B: ");
            String storonaTrStrB = scanner.nextLine();
            double storonaTrB = Double.parseDouble(storonaTrStrB);
            System.out.println("Введите длинну стороны С: ");
            String storonaTrStrC = scanner.nextLine();
            double storonaTrC = Double.parseDouble(storonaTrStrC);
            double poluperimetrTr = ((storonaTrA + storonaTrB + storonaTrC) / 2);
            System.out.println("Площадь или Периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь треугольника: " + (Math.sqrt(poluperimetrTr * (poluperimetrTr - storonaTrA) * (poluperimetrTr - storonaTrB) * (poluperimetrTr - storonaTrC))));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр треугольника: " + (storonaTrA + storonaTrB + storonaTrC));
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        // Вычисление площади и периметра прямоугольника
        else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите длинну стороны А: ");
            String storonaPrStrA = scanner.nextLine();
            double storonaPrA = Double.parseDouble(storonaPrStrA);
            System.out.println("Введите длинну стороны B: ");
            String storonaPrStrB = scanner.nextLine();
            double storonaPrB = Double.parseDouble(storonaPrStrB);
            System.out.println("Площадь или Периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь прямоугольника: " + (storonaPrA * storonaPrB));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр прямоугольника: " + (2 * (storonaPrA + storonaPrB)));
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        // Вычисление площади и периметра трапеции
        else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {
            System.out.println("Введите длинну верхнего основания А: ");
            String storonaTrapStrA = scanner.nextLine();
            double storonaTrapA = Double.parseDouble(storonaTrapStrA);
            System.out.println("Введите длинну нижнего основания B: ");
            String storonaTrapStrB = scanner.nextLine();
            double storonaTrapB = Double.parseDouble(storonaTrapStrB);
            System.out.println("Введите длинну стороны C: ");
            String storonaTrapStrC = scanner.nextLine();
            double storonaTrapC = Double.parseDouble(storonaTrapStrC);
            System.out.println("Введите длинну стороны D: ");
            String storonaTrapStrD = scanner.nextLine();
            double storonaTrapD = Double.parseDouble(storonaTrapStrD);
            double poluperimetrTrap = ((storonaTrapA + storonaTrapB + storonaTrapC + storonaTrapD) / 2);
            System.out.println("Площадь или Периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь трапеции: " + (((storonaTrapA + storonaTrapB) / Math.abs(storonaTrapA - storonaTrapB)) * (Math.sqrt((poluperimetrTrap - storonaTrapA) * (poluperimetrTrap - storonaTrapB) * (poluperimetrTrap - storonaTrapA - storonaTrapC) * (poluperimetrTrap - storonaTrapA - storonaTrapD)))));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр трапеции: " + (storonaTrapA + storonaTrapB + storonaTrapC + storonaTrapD));
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}