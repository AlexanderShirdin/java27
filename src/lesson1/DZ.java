package lesson1;

public class DZ {
    public static void main(String[] args) {
        short money = 1000;
        short pizza = 230;
        byte booblegum = 26;
        double candy = 2.5;
        int amountPizza = money / pizza; // количество купленных Пицц
        int moneyBuyPizza = money % pizza; // сдача после покупки Пицц
        int amountBobblegum = moneyBuyPizza / booblegum; // количество купленных Жвачек
        int moneyBuyBooblegum = moneyBuyPizza % booblegum; // сдача после покупки Жвачек
        int ammountCandy = (int) (moneyBuyBooblegum / candy); // количество купленных Конфет
        double moneyBuyCandy = moneyBuyBooblegum % candy; // сдача после покупки Конфет
        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + amountPizza + " пиццы");
        System.out.println("- " + amountBobblegum + " жвачки");
        System.out.println("- " + ammountCandy + " конфет");
        System.out.println("Сдача с магазина: " + moneyBuyCandy + " руб.");
    }
}