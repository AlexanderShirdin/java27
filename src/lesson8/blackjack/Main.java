package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {
        Koloda koloda = new Koloda();
        Card card = koloda.randomCard();
        System.out.println(card.getName() + " (" + card.getValue() + ")");
    }
}