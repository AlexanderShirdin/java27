package lesson18;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {

        // Сериализация
        java.io.ObjectOutputStream ois = new java.io.ObjectOutputStream(new java.io.FileOutputStream("C://Users//cptbl//Downloads//state.txt"));
        ois.writeDouble(3.14159265D);
        ois.writeObject("The value of PI");
        ois.writeObject(new Point(10, 253)); // Запись объекта класса Point
        ois.flush();
        ois.close();
    }
}