package lesson18;

public class Main2 {
    public static void main(String[] args) throws Exception{
        // Десериализация
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("C://Users//cptbl//Downloads//state.bin"));
        System.out.println("Double: " + ois.readDouble());
        System.out.println("String: " + ois.readObject().toString());
        System.out.println("Point: " + (Point) ois.readObject());
        ois.close();
    }
}