package lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 3);
        holodilnik.addProduct("Груша", 5);
        holodilnik.addProduct("Слива", 2);
        holodilnik.addProduct("Яблоко", 4);
        holodilnik.addProduct("Тесто", 4);
//      holodilnik.printAllProduct();
        holodilnik.getProduct("Яблоко", 3);
        holodilnik.printAllProduct();

        Receipt pirog = new Receipt();
        pirog.setName("Весенний пирог");
        pirog.addIngredients("Яблоко",2);
        pirog.addIngredients("Груша",5);
        pirog.addIngredients("Тесто",2);
        System.out.println(holodilnik.canCook(pirog));
    }
}