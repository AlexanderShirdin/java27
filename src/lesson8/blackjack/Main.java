package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {
        Koloda koloda = new Koloda();
        Card dealCard = koloda.randomCard();
        System.out.println(dealCard.getName() + " (" + dealCard.getValue() + ")");
        System.out.println(koloda.toString());
    }
}